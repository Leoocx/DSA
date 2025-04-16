# Quick Sort

Quicksort é um algoritmo de ordenação que divide uma lista em sublistas menores, classificando-as e recombinando-as. É um dos algoritmos de ordenação mais rápidos e eficientes.

## Como funciona

O Quicksort funciona da seguinte forma:

1. Escolher um elemento da lista, chamado **pivô**.
2. Rearranjar a lista de forma que todos os elementos **menores que o pivô** fiquem à sua esquerda e todos os **maiores que o pivô** fiquem à sua direita.
3. Recursivamente ordenar a sublista dos elementos menores e a sublista dos elementos maiores.

> O Quicksort é um algoritmo recursivo.  
> O processo termina quando todas as verificações `left < right` forem avaliadas como `false`.

![Quicksort-example](https://github.com/user-attachments/assets/bf39e3b6-275e-4a17-acdc-998efe9aa761)

## Estratégia

- **Divisão e conquista**

## Complexidade

- **Médio e melhor caso:** O(n log n)
- **Pior caso:** O(n²) *(geralmente evitado com boas escolhas de pivô)*

## Desempenho

- Rápido e eficiente, especialmente para grandes conjuntos de dados

![quick_sort_hoare](https://github.com/user-attachments/assets/7880e246-2ce9-4c27-985b-822ae090de58)



