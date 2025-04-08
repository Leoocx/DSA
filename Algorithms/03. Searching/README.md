
# Algoritmos de Busca

Dada uma chave de busca e uma coleção de elementos, onde cada
elemento possui um identificador único, desejamos encontrar o
elemento da coleção que possui o identificador igual ao da chave
de busca ou verificar que não existe nenhum elemento na coleção
com a chave fornecida.

# Busca Sequencial

A busca sequencial é o algoritmo mais simples de busca:
• Percorra a lista comparando a chave com os valores dos
elementos em cada uma das posições.
• Se a chave for igual a algum dos elementos, retorne a posição
correspondente na lista.
• Se a lista toda foi percorrida e a chave não for encontrada, retorne
o valor −1

```
1 def buscaSequencial(lista, chave):
2 n = len(lista)
3 for índice in range(n):
4 if lista[índice] == chave:
5 return índice
6
7 return -1

```


# Busca Binária

A busca binária é um algoritmo mais eficiente, entretanto,
requer que a lista esteja ordenada pelos valores da chave de
busca.
• A ideia do algoritmo é a seguinte (assuma que a lista está
ordenada pelos valores da chave de busca):
• Verifique se a chave de busca é igual ao valor da posição do meio
da lista.
• Caso seja igual, devolva esta posição.
• Caso o valor desta posição seja maior que a chave, então repita o
processo, mas considere uma lista reduzida, com os elementos do
começo da lista até a posição anterior a do meio.
• Caso o valor desta posição seja menor que chave, então repita o
processo, mas considere uma lista reduzida, com os elementos da
posição seguinte a do meio até o final da lista.

```
1 def buscaBinária(lista, chave):
2 pos_ini = 0
3 pos_fim = len(lista) - 1
4
5 while pos_ini <= pos_fim:
6 pos_meio = (pos_ini + pos_fim) // 2
7
8 if lista[pos_meio] == chave:
9 return pos_meio
10 if lista[pos_meio] > chave:
11 pos_fim = pos_meio - 1
12 if lista[pos_meio] < chave:
13 pos_ini = pos_meio + 1
14
15 return -1

```
