package Stack;

import java.util.Scanner;
import java.util.Stack;

public class Equal_Stack {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        int n3=sc.nextInt();

        int h1[]=new int [n1];
        int h2[]=new int[n2];
        int h3[]=new int[n3];

        for (int i = 0; i < n1; i++) {
            h1[i]=sc.nextInt();
        }
        for (int i = 0; i < n2; i++) {
            h2[i]=sc.nextInt();
        }
        for (int i = 0; i <n3 ; i++) {
            h3[i]=sc.nextInt();
        }
        int result=equal(h1,h2,h3);
        System.out.println("Maximum Height is :" +result);
    }

    private static int equal(int[] h1, int[] h2, int[] h3) {
        Stack<Integer> stack1=new Stack<>();
        Stack<Integer> stack2=new Stack<>();
        Stack<Integer>stack3=new Stack<>();
        int sum1=0,sum2=0,sum3=0;
        for (int i = h1.length-1; i >=0 ; i--) {
            stack1.push(h1[i]);
            sum1+=h1[i];
        }
        for (int i = h2.length-1; i >=0 ; i--) {
            stack2.push(h2[i]);
            sum2+=h2[i];
        }
        for (int i = h3.length-1; i >=0 ; i--) {
            stack3.push(h3[i]);
            sum3+=h3[i];
        }
        while(true){
            if(sum1==sum2 && sum2==sum3)
                break;
           if(sum1<sum2){
               sum2-=stack2.peek();
               stack2.pop();
           }
           if(sum1<sum3){
               sum3-=stack3.peek();
               stack3.pop();
           }
           if(sum2<sum1){
               sum1-=stack1.peek();
               stack1.pop();
           }
           if(sum2<sum3){
               sum3-=stack3.peek();
               stack3.pop();
           }
           if(sum3<sum1){
               sum1-=stack1.peek();
               stack1.pop();
           }
           if(sum3<sum2){
               sum2-=stack2.peek();
               stack2.pop();
           }
        }
        return sum1;
    }
}
