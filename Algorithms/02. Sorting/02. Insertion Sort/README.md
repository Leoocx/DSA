
# Insertion Sort

Melhor tempo: O(n)

Pior tempo: O(n²)

Espaço: Constante

- Assuma que o valor mais à esquerda está completamente ordenado.
- Do conjunto restante de valores, pegue o valor mais à esquerda e compare com o(s) valor(es) já ordenado(s) à esquerda.
- Se o número já ordenado for maior, troque os dois números; caso contrário, deixe-o no lugar, pois já está ordenado. Agora os dois valores mais à esquerda estão ordenados.
- Passe para o próximo valor a ser ordenado, que agora é o valor mais à esquerda da parte não ordenada do array. Começando com o valor mais à direita da parte ordenada do array, compare os valores, trocando-os se o item ordenado for menor que o item atualmente sendo ordenado.
-Se o valor atual sendo comparado for menor que o valor a ser ordenado, ou se não houver mais itens para comparar, o valor a ser ordenado está no lugar certo. Passe para o próximo valor.
-Quando todos os itens tiverem sido ordenados uma vez, o array estará completamente ordenado.

Isso pode variar em tempo, dependendo de quão próximo de ordenado o array já está. No caso de um array que já está em ordem crescente, o Insertion Sort será executado com complexidade O(n).


![1_bmfRxyIQZEK0Iu5T6YV1sw](https://github.com/user-attachments/assets/0064a0b6-50a8-4f37-825c-7e49daae798e)
