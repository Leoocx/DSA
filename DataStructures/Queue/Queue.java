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
            int[] newQueue = new int[size*2];
            for (int i=0;i<size;i++){
                newQueue[i]=arr[i];
            }
            arr=newQueue;
        }
        arr[fim] = val;
        fim = (fim + 1) % capacity;
        size++;
    }

    void dequeue(){
        if (isEmpty()) {
            System.out.println("A fila está vazia.");
        };
        inicio = (inicio + 1) % capacity;
        size--;
    }

    boolean isEmpty(){
        return size == 0;
    }

    int peek(){
        return arr[inicio];
    }
}
