package Stack;

import java.util.Scanner;
import java.util.Stack;

public class Eval_Postfix {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        System.out.println("PostFix Expression = " +postfix(s));
    }

    private static int postfix(String s) {
        Stack<Integer>stack=new Stack<>();
        for (int i = 0; i <s.length() ; i++) {
            char c=s.charAt(i);

            if(Character.isDigit(c))
                stack.push(c -'0');
            else{
                int val1=stack.pop();
                int val2=stack.pop();
                switch (c){
                    case '+':
                        stack.push(val2+val1);
                        break;
                    case '-':
                        stack.push(val2-val1);
                        break;
                    case '*':
                        stack.push(val2*val1);
                        break;
                    case '/':
                        stack.push(val2/val1);
                        break;
                }
            }
        }
        return stack.pop();
    }
}
