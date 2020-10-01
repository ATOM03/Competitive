package Sorting;

import java.util.Scanner;

public class Insertion_Sort {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int ar[]=new int[N];
        for (int i = 0; i <N; i++) {
            ar[i]=sc.nextInt();
        }

        int Sorted[]=insertion(ar);
        for (int i=0;i<Sorted.length;i++){
            System.out.print(Sorted[i]+" ");
        }
        System.out.println();
    }

    private static int[] insertion(int[] ar) {
        int N=ar.length;
        for (int i=1;i<N;i++){
            int key=ar[i];
            int j=i-1;
            //create a sorted array from the unsorted array
            while(j>=0 && ar[j]>key){
                ar[j+1]=ar[j];
                j=j-1;
            }
            ar[j+1]=key;
        }
        return ar;
    }
}
