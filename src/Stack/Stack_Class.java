package Stack;

import java.util.ArrayList;
import java.util.Scanner;

public class Stack_Class {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Stack s=new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.pop();
        s.print();
        System.out.println(s.top());

    }
    public static class Stack{
        ArrayList<Integer>stack=new ArrayList<>();
        int size=-1;

        public void push(int N){
            stack.add(N);
            size++;
        }
        public int pop(){
            int temp=stack.get(size);
            stack.remove(size);
            size--;
            return temp;
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
