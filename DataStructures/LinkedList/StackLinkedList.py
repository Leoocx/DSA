import time
import tracemalloc
import psutil
import os

from LinkedList import LinkedList, Node

class StackLinkedList:
    def __init__(self):
        self.linked_list = LinkedList()

    def push(self, elemento):
        new_node = Node(elemento)
        new_node.set_next(self.linked_list.get_first())
        self.linked_list.set_first(new_node)
        if self.linked_list.get_size() == 0:
            self.linked_list.set_last(new_node)
        self.linked_list.set_size(self.linked_list.get_size() + 1)

    def pop(self):
        if self.linked_list.get_size() == 0:
            return None
        to_remove = self.linked_list.get_first()
        self.linked_list.set_first(to_remove.get_next())
        to_remove.set_next(None)
        if self.linked_list.get_first() is None:
            self.linked_list.set_last(None)
        self.linked_list.set_size(self.linked_list.get_size() - 1)
        return to_remove.get_value()

    def peek(self):
        first_node = self.linked_list.get_first()
        return first_node.get_value() if first_node else None

    def search(self, elemento):
        current = self.linked_list.get_first()
        while current is not None:
            if current.get_value() == elemento:
                return True
            current = current.get_next()
        return False

    def is_empty(self):
        return self.linked_list.get_size() == 0

    def show(self):
        current = self.linked_list.get_first()
        while current is not None:
            print(current.get_value())
            current = current.get_next()


def medir_tempo_memoria(func):
    def wrapper(*args, **kwargs):
        tracemalloc.start()
        inicio = time.perf_counter()
        resultado = func(*args, **kwargs)
        fim = time.perf_counter()
        mem_atual, mem_pico = tracemalloc.get_traced_memory()
        tracemalloc.stop()
        print(f"⏱️ Tempo: {(fim - inicio):.4f} segundos")
        print(f"🧠 Memória usada: {mem_atual / 1024:.2f} KB (pico: {mem_pico / 1024:.2f} KB)")
        return resultado
    return wrapper

@medir_tempo_memoria
def teste_push(stack, n):
    for i in range(n):
        stack.push(i)

@medir_tempo_memoria
def teste_pop(stack):
    while not fila.is_empty():
        stack.pop()

def mostrar_memoria_processo():
    processo = psutil.Process(os.getpid())
    memoria = processo.memory_info().rss / 1024 / 1024 
    print(f"💾 Memória total do processo: {memoria:.2f} MB")

# ========= RODAR TESTES =========
tamanhos = [1_000, 10_000, 100_000, 1_000_000, 1_500_000]

for n in tamanhos:
    print(f"\n==============================")
    print(f"🔢 Teste com {n:,} elementos")
    print(f"==============================")
    fila = StackLinkedList()

    print("📥 Inserindo elementos...")
    teste_push(fila, n)
    print("📤 Removendo elementos...")
    teste_pop(fila)

    mostrar_memoria_processo()