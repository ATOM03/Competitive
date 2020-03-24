package Stack;

import java.util.Scanner;
import java.util.Stack;

public class Max_Stack {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        Stack<Integer> stack=new Stack<>();
        StackMax s=new StackMax();
        while(N-->0){
            int a=sc.nextInt();
            switch(a){
                case 1 :
                    int b=sc.nextInt();
                    s.push(b,stack);
                    break;
                case 2:
                    s.pop(stack);
                    break;
                case 3 :
                    System.out.println(s.max(stack));
                    break;
            }
        }
    }
}
class StackMax{
    Stack<Integer>max=new Stack<>();

    public void push(int N,Stack<Integer>s){
        if(s.isEmpty()){
            s.push(N);
            max.push(N);
        }
        else{
            int temp=max.peek();
            s.push(N);
            if(N>temp){
                max.push(N);
            }else{
                max.push(temp);
            }

        }
    }
    public void pop(Stack<Integer>s){
        s.pop();
        max.pop();
    }
    public int max(Stack<Integer>s){
        return max.peek();
    }
}

