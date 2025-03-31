public class Main {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<Integer>();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(4);
        linkedList.delete(2);
        linkedList.delete(3);


        for (int i=0;i< linkedList.getSize()-1;i++){
            System.out.println(linkedList.get(i).getValue());
        }

    }
}