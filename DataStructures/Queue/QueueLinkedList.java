public class QueueLinkedList {
    private LinkedList linkedList;

    public QueueLinkedList() {
        this.linkedList = new LinkedList();
    }

    // Insere no final da fila
    public void enqueue(int elemento) {
        linkedList.add(elemento);
    }

    // Remove do início da fila
    public void dequeue() {
        if (!isEmpty()) {
            linkedList.delete(linkedList.getFirst().getValue());
        } else {
            System.out.println("A fila está vazia.");
        }
    }

    // Mostra todos os elementos da fila
    public void show() {
        for (int i = 0; i < linkedList.getSize(); i++) {
            System.out.println(linkedList.get(i).getValue());
        }
    }

    public boolean isEmpty() {
        return linkedList.getSize() == 0;
    }
}
