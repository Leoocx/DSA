public class StackLinkedList {
    LinkedList linkedList;

    public StackLinkedList(){
        linkedList = new LinkedList();
    }

    void push(int elemento){
        Node newNode = new Node(elemento);
        newNode.setNext(linkedList.getFirst());
        linkedList.setFirst(newNode);
        if (linkedList.getSize() == 0) {
            linkedList.setLast(newNode);
        }
        linkedList.setSize(linkedList.getSize() + 1);
    }

    void pop(){
        if (linkedList.getSize() == 0) return;
        Node toRemove = linkedList.getFirst();
        linkedList.setFirst(toRemove.getNext());
        toRemove.setNext(null);
        if (linkedList.getFirst() == null) {
            linkedList.setLast(null);
        }
        linkedList.setSize(linkedList.getSize() - 1);
    }

    int peek(){
        return linkedList.getFirst().getValue();
    }

    boolean search(int elemento){
        Node current = linkedList.getFirst();
        while (current != null){
            if (current.getValue() == elemento){
                return true;
            }
            current = current.getNext();
        }
        return false;
    }

    boolean isEmpty(){
        return linkedList.getSize() == 0;
    }

    void show(){
        Node current = linkedList.getFirst();
        while (current != null){
            System.out.println(current.getValue());
            current = current.getNext();
        }
    }
}
