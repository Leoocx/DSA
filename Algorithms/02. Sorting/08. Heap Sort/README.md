# 📦 Heap Sort

Heap Sort é um algoritmo de ordenação baseado em comparações que utiliza uma estrutura de dados chamada **heap** para ordenar os elementos de forma eficiente. Ele é conhecido pela sua consistência no desempenho e por não precisar de memória extra além do array original.

---

## 🔧 Como funciona

1. **Construção do Heap**  
   O array de entrada é transformado em um heap, que pode ser:
   - **Max-Heap**: a raiz contém o maior elemento.
   - **Min-Heap**: a raiz contém o menor elemento.  
   Essa estrutura pode ser visualizada como uma árvore binária, mas é implementada diretamente em um array.

![Heap_sort_example](https://github.com/user-attachments/assets/97c5f633-9427-49b1-b9d0-bac068296da3)


2. **Extração e Heapificação**  
   O elemento da raiz (maior ou menor) é trocado com o último elemento do heap.  
   Em seguida, o tamanho do heap é reduzido e a propriedade de heap é restaurada usando o processo de *heapify* (reorganização do heap).

3. **Iteração**  
   O processo de troca + heapify continua até que todos os elementos estejam ordenados.


---

## ⏱️ Complexidade de Tempo

| Caso       | Complexidade |
|------------|--------------|
| Melhor     | O(n log n)   |
| Médio      | O(n log n)   |
| Pior       | O(n log n)   |

Heap Sort é eficiente mesmo nos piores casos e não depende de sorteios ou pivôs, como o Quick Sort.

---


![Sorting_heapsort_anim](https://github.com/user-attachments/assets/5a6a0f3c-9937-4901-9879-a2016c4470e3)

