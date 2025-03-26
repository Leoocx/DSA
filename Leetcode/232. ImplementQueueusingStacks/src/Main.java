import java.util.Stack;

public class Main {


    class MyQueue {
        Stack<Integer> stk1;
        Stack<Integer> aux;
        public MyQueue() {
            stk1 = new Stack<>();
            aux = new Stack<>();
        }

        public void push(int x) {
            while (!(stk1.empty())){
                aux.push(stk1.pop());
            }
            stk1.add(x);

            while (!(aux.empty())){
                stk1.push(aux.pop());
            }
        }

        public int pop() {
            if (!(stk1.empty())){
                return stk1.pop();
            }
            return -1;
        }

        public int peek() {
            return stk1.peek();
        }

        public boolean empty() {
            return stk1.isEmpty();
        }
    }

    /**
     * Your MyQueue object will be instantiated and called as such:
     * MyQueue obj = new MyQueue();
     * obj.push(x);
     * int param_2 = obj.pop();
     * int param_3 = obj.peek();
     * boolean param_4 = obj.empty();
     */

    public static void main(String[] args) {

    }
}