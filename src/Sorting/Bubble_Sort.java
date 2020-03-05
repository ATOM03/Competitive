package Sorting;

import java.util.Scanner;
public class Bubble_Sort {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int ar[]=new int[N];
        for (int i = 0; i <N ; i++) {
            ar[i]=sc.nextInt();
        }

        bubble(ar);
    }

    private static void bubble(int[] ar) {
        boolean isSorted=false;
        int lastElment=ar.length-1;
        int swap1=0;
        while(!isSorted){
            isSorted=true;

            for(int i=0;i<lastElment;i++){
                if(ar[i]>ar[i+1]){
                    int temp=ar[i];
                    ar[i]=ar[i+1];
                    ar[i+1]=temp;
                    swap1++;
                    isSorted=false;
                }
            }
            lastElment--;
        }

        System.out.println("Array is sorted in " +swap1 + " swaps.");
        System.out.println("First Element: " +ar[0]);
        System.out.println("Last Element: "+ar[ar.length-1]);
    }
}
