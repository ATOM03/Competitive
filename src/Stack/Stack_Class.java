package Stack;

import java.util.ArrayList;
import java.util.Scanner;

public class Stack_Class {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int tc=sc.nextInt();
        while(tc-->0) {
            Stack s = new Stack();
            int Q=sc.nextInt();
            while(Q-->0){
                int a=sc.nextInt();
                switch (a){
                    case 1:
                        int b=sc.nextInt();
                        s.push(b);
                        break;
                    case 2:
                        System.out.print(s.pop()+" ");
                        break;
                    default:
                        System.out.println("Entered Wrong Input!!!");
                        break;
                }
            }
            System.out.println();
        }

//        s.push(1);
//        s.push(2);
//        s.push(3);
//        s.push(4);
//        s.pop();
//        s.print();
//        System.out.println(s.top());

    }
    public static class Stack{
        ArrayList<Integer>stack=new ArrayList<>();
        int size=-1;

        public void push(int N){
            stack.add(N);
            size++;
        }
        public int pop(){

            if(size==-1){
                return -1;
            }else {
                int temp = stack.get(size);
                stack.remove(size);
                size--;
                return temp;
            }
        }
        public int top(){
            return stack.get(size);
        }
        public void print(){
            for (int i = size; i >=0 ; i--) {
                System.out.print(stack.get(i)+" => ");
            }
            System.out.println("End");
        }
    }
}
