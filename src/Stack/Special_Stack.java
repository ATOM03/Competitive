package Stack;

import java.util.Stack;

public class Special_Stack {
    public static void main(String[] args) {
        SpecialStack stack=new SpecialStack();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println(stack.getMin());
        stack.push(5);
        System.out.println(stack.getMin());
        stack.pop();
        System.out.println(stack.getMin());
    }
    public static class SpecialStack extends Stack<Integer>{
        Stack<Integer> min =new Stack<>();
        public void push(int N){
            if(isEmpty()){
                super.push(N);
                min.push(N);
            }
            else{
                super.push(N);
                int y=min.pop();
                min.push(y);
                if(N<y){
                    min.push(N);
                }else
                    min.push(y);
            }
        }
        public int pop1(){
            int x=super.pop();
            min.pop();
            return x;
        }
        public int getMin(){
            int x=min.pop();
            min.push(x);
            return x;
        }
    }
}
