public class MyCircularQueue {
    int[] arr;
    int inicio=0;
    int fim=-1;
    int size=0;
    int capacity;
    public MyCircularQueue(int k) {
        this.capacity=k;
        this.arr= new int[capacity];
    }

    public boolean enQueue(int value) {
        if (isFull())
            return false;
        fim = (fim+1) % capacity;
        arr[fim]=value;
        size++;
        return true;
    }

    public boolean deQueue() {
        if (isEmpty()) return false;

        inicio = (inicio + 1) % capacity;
        size--;
        return true;

    }

    public int Front() {
        if (isEmpty()) return -1;
        return arr[inicio];
    }
    public int Rear() {
        if (isEmpty()) return -1;
        return arr[fim];
    }

    public boolean isEmpty() {
        return size==0;
    }

    public boolean isFull() {
        return size==arr.length;
    }



}