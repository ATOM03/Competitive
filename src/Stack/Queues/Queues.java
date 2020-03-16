package Stack.Queues;

import java.util.Stack;

public class Queues {
    public static void main(String[] args) {
        queue q=new queue();
        q.push(1);
        q.push(2);
        q.push(3);
        q.push(4);
        q.print();
        q.pop();
        q.print();
    }
    public static class queue{
        private Stack <Integer> stack1=new Stack();
        private Stack <Integer> stack2=new Stack();

        public void push(int N){
            while(!stack2.isEmpty()){
                stack1.push(stack2.pop());
            }
            stack1.push(N);
            while(!stack1.isEmpty()){
                stack2.push(stack1.pop());
            }
        }
        public int pop(){
            int temp=stack2.pop();
            return temp;
        }
        public void print(){
            print(stack2);
            System.out.println();;
        }

        private void print(Stack<Integer>stack2) {
            if(stack2.isEmpty())
                return;
            int x=stack2.peek();
            stack2.pop();
            System.out.print(x+" ");
            print(stack2);
            stack2.push(x);
        }
    }
}
