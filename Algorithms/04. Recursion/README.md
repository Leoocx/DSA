# Recursividade

Um algoritmo recursivo é um algoritmo que se chama a si mesmo, diretamente ou indiretamente, para resolver um problema. A ideia é diminuir o problema original até que seja possível resolvê-lo de forma direta. 
Como funciona

    O algoritmo divide o problema original em um problema menor ou mais simples. 

O algoritmo resolve o problema menor. 
O algoritmo repete os passos 1 e 2 até que o problema seja resolvido de forma direta. 

Exemplos 

    1. O cálculo do fatorial de um número
    2. O cálculo do n-ésimo termo de uma sequência de Fibonacci 

 ![factorial](https://github.com/user-attachments/assets/d37f225f-c5fe-48bc-9a26-90eb70b0080e)


Vantagens e limitações

    * A recursividade pode ser muito poderosa em alguns casos, mas ineficiente em outros. 

A definição recursiva de uma função deve ser interrompida quando uma condição for satisfeita, caso contrário, pode ocorrer um laço infinito. 
O espaço de memória que uma função recursiva consome para rascunho pode ser grande. 

Análise de algoritmos recursivos
Para analisar um algoritmo recursivo, você pode: 

    1. Estabelecer a relação de recorrência.
    2. Expandir a árvore de execução.
    3. Determinar a altura máxima da árvore.
    4. Somar o custo de cada nível de execução.
    5. Somar o custo total.
