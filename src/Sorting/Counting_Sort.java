package Sorting;

import java.util.Scanner;

public class Counting_Sort {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int k=sc.nextInt();
        int ar[]={2,5,3,0,2,3,0,3};
        count(ar,k);
        for (int i = 0; i <ar.length ; i++) {
            System.out.print(ar[i]+" ");
        }
        System.out.println();
    }

    private static void count(int[] ar,int k) {
        int C[]=new int[k];
        int B[]=new int[ar.length];
        for (int i = 0; i <k ; i++) {
            C[i]=0;
        }
        for (int i = 0; i <ar.length ; i++) {
            C[ar[i]]++;
        }
        for (int i=1;i<k;i++)
            C[i]=C[i]+C[i-1];
        for(int i=ar.length-1;i>=0;i--){
            B[C[ar[i]]-1]=ar[i];
            C[ar[i]]--;
        }
        for (int i = 0; i <ar.length ; i++) {
            ar[i]=B[i];
        }
    }
}
