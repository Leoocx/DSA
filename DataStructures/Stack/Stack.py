import time
import tracemalloc
import psutil  #  PRECISA USAR pip install NO TERMINAL
import os

class Stack:
    def __init__(self, capacidade):
        self.stack = [None] * capacidade
        self.topo = -1

    def push(self, elemento):
        if self.is_full():
            self.stack += [None] * len(self.stack)
        self.topo += 1
        self.stack[self.topo] = elemento

    def pop(self):
        if self.is_empty():
            return None
        elemento_removido = self.stack[self.topo]
        self.stack[self.topo] = None
        self.topo -= 1
        return elemento_removido

    def is_full(self):
        return self.topo == len(self.stack) - 1

    def is_empty(self):
        return self.topo == -1

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
def teste_push(pilha, n):
    for i in range(n):
        pilha.push(i)

@medir_tempo_memoria
def teste_pop(pilha):
    while not pilha.is_empty():
        pilha.pop()

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
    pilha = Stack(n)

    print("📥 Inserindo elementos...")
    teste_push(pilha, n)
    print("📤 Removendo elementos...")
    teste_pop(pilha)

    mostrar_memoria_processo()
