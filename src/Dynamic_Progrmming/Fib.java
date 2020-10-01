package Dynamic_Progrmming;

import java.util.Scanner;

public class Fib {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int ar[]=new int[N];

        System.out.println(fib(ar));
    }

    private static int  fib(int[] ar) {
        ar[0]=0;
        ar[1]=1;

        for (int i = 2; i <ar.length ; i++) {
            ar[i]=ar[i-1]+ar[i-2];
        }
        return ar[ar.length-1];
    }
    public int rodcutten(int ar[]){
         ar[0]=0;
        ar[1]=1;

        for (int i = 2; i <ar.length ; i++) {
            ar[i]=ar[i-1]+ar[i-2];
        }
        return ar[ar.length-1];
    }
        
}
