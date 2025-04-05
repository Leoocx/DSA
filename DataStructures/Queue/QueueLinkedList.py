import time
import tracemalloc
import psutil  #  PRECISA USAR pip install NO TERMINAL
import os

from LinkedList import LinkedList

class QueueLinkedList:
    def __init__(self):
        self.linked_list = LinkedList()

    # Insere no final da fila
    def enqueue(self, elemento):
        self.linked_list.add(elemento)

    # Remove do início da fila
    def dequeue(self):
        if not self.is_empty():
            self.linked_list.delete(self.linked_list.get_first().get_value())
        else:
            print("A fila está vazia.")

    # Mostra todos os elementos da fila
    def show(self):
        current = self.linked_list.get_first()
        while current is not None:
            print(current.get_value())
            current = current.get_next()

    def is_empty(self):
        return self.linked_list.get_size() == 0



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
def teste_enqueue(fila, n):
    for i in range(n):
        fila.enqueue(i)

@medir_tempo_memoria
def teste_dequeue(fila):
    while not fila.is_empty():
        fila.dequeue()

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
    fila = QueueLinkedList()

    print("📥 Inserindo elementos...")
    teste_enqueue(fila, n)
    print("📤 Removendo elementos...")
    teste_dequeue(fila)

    mostrar_memoria_processo()