# Busca Binaria

A busca binária (ou pesquisa binária) é um algoritmo de busca para vetores ordenados (arrays). A sua principal vantagem é que a busca é realizada em tempo logarítmico, sendo mais rápida do que a busca linear.

A busca binária é um algoritmo de busca eficiente que opera em vetores ordenados. Ela divide o vetor pela metade e compara o elemento do meio com o valor desejado, ajustando o intervalo de busca de acordo com o resultado da comparação. O processo é repetido até encontrar o elemento ou determinar que ele está ausente.

![68747470733a2f2f6473303535757a6574616f62622e636c6f756466726f6e742e6e65742f696d6167655f6f7074696d697a65722f373137343033623133363833373663623666393135653662346265656233613761643534313035652e676966](https://github.com/user-attachments/assets/7d1339d1-08c0-4627-8655-d5eb80743e60)

# Análise do Algoritmo
O melhor caso da busca binária ocorre quando o elemento que procuramos está no meio do vetor. Dessa forma, haverá apenar uma chamada recursiva/iteração. Portanto, o algoritmo tem complexidade constante: Θ(1) ou O(1).

O pior caso ocorre quando o elemento que buscamos não está no vetor. Tanto a versão iterativa, como a versão recursiva possuem complexidade de O(log n).
No caso da versão recursiva, a equação de recorrência do pior caso é dada por:

![eq_recorrencia_busca_binaria](https://github.com/user-attachments/assets/c9990b65-176a-4eef-81ad-84e62d36ac43)

A equação pode se resolvida pelo Teorema Meste produzindo T(n) = Θ(log n), que implica que T(n) = O(log n). A mesma complexidade pode ser obtida também via Método de Akra-Bazzi. O caso médio também é O(log n).

