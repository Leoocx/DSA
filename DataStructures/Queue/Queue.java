public class Queue {
    int[] arr;
    int size;

    public Queue(int capacidade){
        this.arr=new int[capacidade];
        this.size=-1;
    }

    void enqueue(int elemento){
        if (isFull()){
            int[] newQueue = new int[2*arr.length];
            for (int i=0; i<=size;i++){
                newQueue[i]=arr[i];
            }
            arr=newQueue;
        }
        arr[++size]=elemento;


    }
    int dequeue(){
        if (!isEmpty()){
            int elementoRemovido = arr[0];
            for (int i=1; i<arr.length; i++){
                arr[i-1]=arr[i];
            }
            size--;
            return elementoRemovido;
        } return -1; 
    }

    boolean isFull(){
        return size == arr.length-1;
    }

    boolean isEmpty(){
        return size==-1;
    }

    void show(){
        for (int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }

    }

}
