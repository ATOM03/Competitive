package Array;

public class Reverse_Array {
    public static void main(String[] args) {
        int ar[]={1,2,3,4,5,6};
        int N=5;
        reverse(ar,N-1);
        for (int i = 0; i <ar.length ; i++) {
            System.out.print(ar[i]+" ");
        }
        System.out.println();
    }
    private static void reverse(int[] ar,int N) {
        int mid=N/2;
        int i=0;
        while(i<=mid){
            int temp=ar[i];
            ar[i]=ar[N-i];
            ar[N-i]=temp;
            i++;
        }
    }
    private static int removeduplicate(int ar[]){
        int N=ar.length;
        Arrays.sort(ar);;
        int j=0;
        for(int i=0;i<N-1;i++){
            if(ar[i]!=ar[i+1])
                ar[j++]=ar[i];
        }
        ar[j++]=ar[n-1];
        return j;
}
