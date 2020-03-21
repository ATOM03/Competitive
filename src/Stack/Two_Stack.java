package Stack;

import java.util.Scanner;

public class Two_Stack {
    public static class TwoStack{
        int size;
        int top1,top2;

        int ar[]=new int [100];
        public TwoStack(){
            this.size=ar.length;
            this.top1=-1;
            this.top2=size;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int tc=sc.nextInt();
        while(tc-->0) {
            TwoStack s = new TwoStack();
            Stack sq=new Stack();
            int Q=sc.nextInt();
            while(Q-->0){
                int a=sc.nextInt();
                switch (a){
                    case 1:
                        int b=sc.nextInt();
                        switch (b) {
                            case 1:
                                int x=sc.nextInt();
                                sq.push1(x, s);
                                break;
                            case 2:
                                System.out.print(sq.pop1(s) + " ");
                                break;
                        }
                        break;
                    case 2:
                        int c=sc.nextInt();
                        switch (c) {
                            case 1:
                                int y = sc.nextInt();
                                sq.push2(y, s);
                                break;
                            case 2:
                                System.out.print(sq.pop2(s) + " ");
                                break;
                        }
                        break;
                    default:
                        System.out.println("Entered Wrong Input!!!");
                        break;
                }
            }
            System.out.println();
        }
    }
    public static class Stack{
        public void push1(int x,TwoStack q){
            q.top1++;
            q.ar[q.top1]=x;
        }
        public void push2(int x,TwoStack q){
            q.top2--;
            q.ar[q.top2]=x;
        }
        public int pop1(TwoStack q){
            if(q.top1==-1){
                return -1;
            }
            int temp=q.ar[q.top1];
            q.top1--;
            return temp;
        }
        public int pop2(TwoStack q){
            if(q.top2==q.size){
                return -1;
            }
            int temp=q.ar[q.top2];
            q.top2++;
            return temp;
        }

    }
}
