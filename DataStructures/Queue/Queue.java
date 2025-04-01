public class Queue {
    int[] arr;
    int size;

    public Queue(int capacidade){
        this.arr=new int[capacidade];
        this.size=-1;
    }

    void enqueue(int elemento){
        if (isFull()){
            throw new IllegalStateException("A Fila está cheia.");
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
        if (arr.length==size){
            return true;
        } return false;
    }

    boolean isEmpty(){
        if (size==-1){
            return true;
        } return false;
    }

    void show(){
        for (int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }

    }

}
