package Sorting;

public class MergeSort {
    public static void main(String[] args) {
        int ar[]={38,27,43,3,9,82,10};
        divide(ar,0,ar.length-1);
        for (int i = 0; i < ar.length; i++) {
            System.out.print(ar[i]+" ");
        }
        System.out.println();
    }

    private static void divide(int[] ar, int l, int r) {
        if(l<r){
            int mid=(l+r)/2;
            divide(ar,l,mid);
            divide(ar,mid+1,r);

            merge(ar,l,mid,r);
        }
    }

    private static void merge(int[] ar, int l, int mid, int r) {
        int n1=mid-l+1;
        int n2=r-mid;

        int Li[]=new int[n1];
        int Ri[]=new int[n2];
        for (int i = 0; i <n1 ; i++) {
            Li[i]=ar[l+i];
        }
        for (int i = 0; i <n2 ; i++) {
            Ri[i]=ar[mid+1+i];
        }

        int i=0,j=0;
        int k=l;

        while(i<n1 && j<n2){
            if(Li[i]<=Ri[j]){
                ar[k]=Li[i];
                i++;
            }
            else{
                ar[k]=Ri[j];
                j++;
            }
            k++;
        }

        while(i<n1){
            ar[k]=Li[i];
            i++;
            k++;
        }
        while(i<n2){
            ar[k]=Ri[j];
            j++;
            k++;
        }

    }
}
