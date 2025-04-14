# Estrutura de Dados Set em Java

`Set` é uma estrutura de dados utilizada como uma coleção de objetos. O Java oferece suporte a essa estrutura por meio da sua biblioteca Java Collections. Existem várias maneiras de implementar um `Set`, e o Java fornece três implementações principais, além de operações úteis como interseção entre conjuntos.

## Comparação: HashSet vs TreeSet vs LinkedHashSet

### HashSet
- Utiliza uma *hashtable* para armazenar os elementos.
- Os elementos não são armazenados em ordem (ordem não garantida).
- Os métodos `add`, `remove` e `contains` possuem complexidade de tempo constante: **O(1)**.

### TreeSet
- Utiliza uma árvore *Red-Black* para armazenar os elementos.
- Os elementos são armazenados em ordem ordenada.
- Os métodos `add`, `remove` e `contains` possuem complexidade de tempo: **O(log n)**.

### LinkedHashSet
- Fica entre o `HashSet` e o `TreeSet`. É implementado como uma *hashtable* com uma *linked list* ligada aos seus elementos.
- A complexidade de tempo dos métodos básicos também é **O(1)**.

## Observação
O `HashSet` possui o melhor desempenho dentre as implementações de `Set`, quando comparado ao `LinkedHashSet` e `TreeSet`.
