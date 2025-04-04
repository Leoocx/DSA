public class LinkedList {
    private Node first;
    private Node last;
    private int size;

    public LinkedList() {
        this.size = 0;
    }

    public Node getFirst() {
        return first;
    }

    public void setFirst(Node first) {
        this.first = first;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public Node getLast() {
        return last;
    }

    public void setLast(Node last) {
        this.last = last;
    }

    public void add(int newValue) {
        Node newNode = new Node(newValue);
        if (first == null && last == null) {
            this.first = newNode;
            this.last = newNode;
        } else {
            this.last.setNext(newNode);
            this.last = newNode;
        }
        this.size++;
    }

    public void delete(int valueToRemove) {
        Node previous = null;
        Node current = this.first;

        while (current != null) {
            if (current.getValue() == valueToRemove) {
                if (size == 1) {
                    first = null;
                    last = null;
                } else if (current == first) {
                    first = current.getNext();
                } else if (current == last) {
                    last = previous;
                    last.setNext(null);
                } else {
                    previous.setNext(current.getNext());
                }
                size--;
                break;
            }
            previous = current;
            current = current.getNext();
        }
    }

    public Node get(int index) {
        Node current = this.first;
        for (int i = 0; i < index; i++) {
            if (current.getNext() != null) {
                current = current.getNext();
            }
        }
        return current;
    }
}
