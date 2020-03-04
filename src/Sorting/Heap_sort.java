package Sorting;

public class Heap_sort {
    public static void main(String[] args) {
        int ar[]={12, 11, 13, 5, 6, 7};
        sort(ar);
        for (int i = 0; i <ar.length ; i++) {
            System.out.print(ar[i]+" ");
        }
        System.out.println();
    }

    private static void sort(int[] ar) {
        int n=ar.length;
        for (int i = n/2-1; i >=0 ; i--) {
            heapify(ar,n,i);
        }
        for (int i = n-1; i >=0 ; i--) {
            int temp=ar[0];
            ar[0]=ar[i];
            ar[i]=temp;

            heapify(ar,i,0);
        }
    }

    private static void heapify(int[] ar, int n, int i) {
        int largest=i;
        int left=2*i+1;
        int right=2*i+2;

        if(left<n && ar[left]>ar[largest]){
            largest=left;
        }
        if(right<n && ar[right]>ar[largest]){
            largest=right;
        }
        if(largest!=i){
            int temp=ar[i];
            ar[i]=ar[largest];
            ar[largest] =temp;

            heapify(ar,n,largest);
        }
    }
}
