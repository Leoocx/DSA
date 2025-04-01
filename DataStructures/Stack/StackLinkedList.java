public class StackLinkedList {
    LinkedList linkedList;

    public StackLinkedList(){
        linkedList=new LinkedList<>();
    }

    void push(int elemento){
        linkedList.add(elemento);
        
    }

    void pop(){
        linkedList.delete(linkedList.getLast());        
    }
    Object peek(){
        return linkedList.getLast().getValue();
    }
    boolean search(int elemento){
        for (int i=0; i<linkedList.getSize();i++){
            if (linkedList.get(i).equals(elemento)){
                return true;
            }
        } return false;
    }

    boolean isEmpty(){
        if (linkedList.getSize()==0){
            return true;
        } return false;
    }

    void show(){
        for (int i=0; i<linkedList.getSize()-1;i++){
            System.out.println(linkedList.get(i).getValue());
        }
    }


}
