public class Stack {
    int[] stack;
    int topo;


    public Stack(int capacidade){
        this.stack=new int[capacidade];
        this.topo=-1;
    }

    void push(int elemento){
        if (isFull()){
            throw new IllegalStateException("ERRO: A pilha está cheia.");
        }
        stack[++topo]=elemento;
        
    }
    int pop(){
        if (isEmpty()){
            throw new IllegalStateException("ERRO: A pilha está vazia.");
        }
        int elementoRemovido = stack[topo];
        stack[topo]=0;
        topo--;
        return elementoRemovido;
    }

    int peek(){
        return topo;
    }

    boolean search(int elemento){
        for (int i=0; i<stack.length;i++){
            if (stack[i]==elemento){
                return true;
            }
        }return false;
    }

    boolean isFull(){
        if (topo==stack.length){
            return true;
        } return false;
    }

    boolean isEmpty(){
        return topo==-1;
    }

    void show(){
        for (int i=0;i<stack.length;i++){
            System.out.println(stack[i]);
        }
    }

}
