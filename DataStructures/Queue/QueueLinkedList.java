public class QueueLinkedList {
    LinkedList linkedList;

    public QueueLinkedList(){
        this.linkedList=new LinkedList<>();
    }
    void enqueue(int elemento){
        linkedList.add(elemento);
    }

    void dequeue(){
        linkedList.delete(linkedList.getFirst());
    }

    void show(){
        for (int i=0;i<linkedList.getSize()-1;i++){
            System.out.println(linkedList.get(i).getValue());
        }
    }

    boolean isEmpty(){
        if (linkedList.getSize()==0){
            return true;
        } return false;
    }
}
