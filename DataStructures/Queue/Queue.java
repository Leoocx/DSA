public class Queue {
    private int[] arr;
    private int inicio, fim, size, capacity;

    public Queue(int capacity){
        arr = new int[capacity];
        this.capacity = capacity;
        inicio = 0;
        fim = 0;
        size = 0;
    }

    void enqueue(int val){
        if (size == capacity) {
            // Cria um novo array com o dobro do tamanho
            int[] newQueue = new int[capacity * 2];
            // Move os elementos para o novo array
            for (int i = 0; i < size; i++) {
                newQueue[i] = arr[(inicio + i) % capacity];
            }
            arr = newQueue;
            inicio = 0; // O início agora será 0, pois o array foi refeito
            fim = size; // O fim será igual ao tamanho da fila após a cópia
            capacity *= 2; // Atualiza a capacidade
        }
        arr[fim] = val;
        fim = (fim + 1) % capacity;
        size++;
    }

    void dequeue(){
        if (isEmpty()) {
            System.out.println("A fila está vazia.");
            return;
        }
        inicio = (inicio + 1) % capacity;
        size--;
    }

    boolean isEmpty(){
        return size == 0;
    }

    int peek(){
        if (isEmpty()) {
            System.out.println("A fila está vazia.");
            return -1; // Retorna -1 em caso de erro
        }
        return arr[inicio];
    }
}
