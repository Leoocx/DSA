public class LinkedList<T> {
    private Node<T> first;
    private Node<T> last;
    private int size;

    public LinkedList() {
        this.size = 0;
    }

    public Node<T> getFirst() {
        return first;
    }

    public void setFirst(Node<T> first) {
        this.first = first;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public Node<T> getLast() {
        return last;
    }

    public void setLast(Node<T> last) {
        this.last = last;
    }

    public void add(T newValue){
        Node<T> newNode = new Node<T>(newValue);
        if (first==null && last==null){
            this.first=newNode;
            this.last=newNode;
            this.size++;
        } else{
            this.last.setNext(newNode);
            this.last=newNode;
        }
        this.size++;
    }
    public void delete(T search){
        Node<T> last = null;
        Node<T> actually = this.first;
        for (int i=0; i<getSize(); i++){
            if (actually.getValue().equals(search)){
                if (this.size==1){
                    this.first=null;
                    this.last=null;
                }else if (actually==first){
                    this.first=actually.getNext();
                    actually.setNext(null);
                }else if(actually==last){
                    this.last=last;
                    last.setNext(null);
                }else{
                    last.setNext(actually.getNext());
                    last=null;
                }
                this.size--;
                break;
            }
            last=actually;
            actually=actually.getNext();
        }
    }
    public Node<T> get(int index){
        Node<T> actually = this.first;
        for (int i=0; i<index; i++){
            if (actually.getNext() != null){
                actually=actually.getNext();
            }
        }
        return actually;
    }


}
