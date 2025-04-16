
# Shell Sort

O **Shell Sort** é um algoritmo de ordenação que melhora o desempenho do método de inserção direta. Ele funciona dividindo a lista original em sublistas com espaçamentos definidos e, em seguida, ordenando essas sublistas individualmente. Esse processo reduz a quantidade de trocas necessárias à medida que os elementos se aproximam da posição correta.

---

## 📌 Como Funciona

1. Divide a lista em sublistas com base em um intervalo (gap).
2. Aplica o método de **inserção direta** (Insertion Sort) em cada sublista.
3. Diminui progressivamente o intervalo até que ele seja igual a 1.
4. No final, realiza uma ordenação final semelhante ao Insertion Sort tradicional, mas com a maioria dos elementos já próximos da posição correta.

![20210707133409](https://github.com/user-attachments/assets/a4323adb-9c06-45f3-aec7-22b5d45cf6cc)


---

## ✅ Vantagens

- Simples e fácil de implementar.
- Mais eficiente que o Insertion Sort para listas moderadamente grandes.
- Requer pouca memória extra (in-place).

---

## ❌ Desvantagens

- O desempenho depende fortemente da escolha da **sequência de espaçamentos (gaps)**.
- Não é um algoritmo **estável** (elementos iguais podem mudar de ordem relativa).
- Pode ser superado por algoritmos mais modernos como Quick Sort ou Merge Sort em grandes volumes de dados.

---

## 📚 Aplicações

- Ideal para arquivos ou listas de **tamanho moderado**.
- Útil quando se busca uma implementação simples, sem dependência de memória adicional.

---

## 🕒 Desempenho

- O tempo de execução depende da **sequência de gaps** utilizada.
- No pior caso, pode chegar a **O(n²)**, mas com boas sequências (como a de Hibbard ou Sedgewick), pode se aproximar de **O(n log² n)**.

---

## 🧠 História

O **Shell Sort** foi criado por **Donald Shell** em **1959** e publicado pela **Universidade de Cincinnati**. Foi o primeiro algoritmo de ordenação a quebrar a barreira de desempenho do Insertion Sort simples ao permitir comparações e trocas de elementos distantes.

---

## 🔗 Referências

- [Wikipedia: Shell Sort](https://en.wikipedia.org/wiki/Shellsort)
- [GeeksforGeeks: Shell Sort](https://www.geeksforgeeks.org/shellsort/)
