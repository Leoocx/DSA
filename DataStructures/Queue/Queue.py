import time
import tracemalloc
import psutil  #  PRECISA USAR pip install NO TERMINAL
import os


class Queue:
    def __init__(self, capacity):
        self.arr = [0] * capacity
        self.capacity = capacity
        self.inicio = 0
        self.fim = 0
        self.size = 0

    def enqueue(self, val):
        if self.size == self.capacity:
            new_capacity = self.capacity * 2
            new_arr = [0] * new_capacity
            for i in range(self.size):
                new_arr[i] = self.arr[(self.inicio + i) % self.capacity]
            self.arr = new_arr
            self.inicio = 0
            self.fim = self.size
            self.capacity = new_capacity

        self.arr[self.fim] = val
        self.fim = (self.fim + 1) % self.capacity
        self.size += 1

    def dequeue(self):
        if self.is_empty():
            print("A fila está vazia.")
            return
        self.inicio = (self.inicio + 1) % self.capacity
        self.size -= 1

    def is_empty(self):
        return self.size == 0

    def peek(self):
        if self.is_empty():
            print("A fila está vazia.")
            return None
        return self.arr[self.inicio]
    
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
    fila = Queue(n)

    print("📥 Inserindo elementos...")
    teste_enqueue(fila, n)
    print("📤 Removendo elementos...")
    teste_dequeue(fila)

    mostrar_memoria_processo()