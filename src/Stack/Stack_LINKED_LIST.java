package Stack;

import java.util.Scanner;

public class Stack_LINKED_LIST {
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
    }
    public static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data=data;
            next=null;
        }
    }

    public static class Stack {
        Node head;
        public void push(int a){
            Node temp=new Node(a);
            if(head==null){
                head=temp;
            }else{
                temp.next=head;
                head=temp;
            }
        }
        public int pop(){
            if(head==null)
                return -1;
            else{
                int temp=head.data;
                head=head.next;
                return temp;
            }
        }
    }
}
