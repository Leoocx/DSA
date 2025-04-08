class MyCircularDeque {
    int[] arr;
    int inicio=0;
    int fim=1;
    int size=0;
    int capacity;
    public MyCircularDeque(int k) {
        this.capacity=k;
        this.arr=new int[capacity];
    }

    public boolean insertFront(int value) {
        if (isFull()) return false;
        inicio = (inicio+1)%capacity;
        arr[inicio]=value;
        size++;
        return true;
    }

    public boolean insertLast(int value) {
        if (isFull()) return false;
        fim=(fim-1+arr.length)%capacity;
        arr[fim]=value;
        size++;
        return true;
    }

    public boolean deleteFront() {
        if (isEmpty()) return false;
        inicio=(inicio-1+capacity)%capacity;
        size--;
        return true;
    }

    public boolean deleteLast() {
        if (isEmpty()) return false;
        fim=(fim+1)%capacity;
        size--;
        return true;
    }

    public int getFront() {
        if (isEmpty()) return -1;
        return arr[inicio];
    }

    public int getRear() {
        if (isEmpty()) return -1;
        return arr[fim];
    }

    public boolean isEmpty() {
        return size==0;
    }

    public boolean isFull() {
        return size == arr.length;
    }
}
