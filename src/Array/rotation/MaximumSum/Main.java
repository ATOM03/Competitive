package Array.rotation.MaximumSum;

import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int tc=sc.nextInt();
        while(tc-->0){
            int N=sc.nextInt();
            int ar[]=new int[N];
            for(int i=0;i<N;i++){
                ar[i]=sc.nextInt();
            }
            System.out.println(max(ar,N));
        }
    }
    private static int max(int ar[],int N){
        int max_kadane=kadane(ar,N);
        int max_wrap=0;
        for (int i = 0; i < N; i++) {
            max_wrap=max_wrap+ar[i];
            ar[i]=-ar[i];
        }
        max_wrap=max_wrap+kadane(ar,N);
        return (max_wrap>max_kadane)?max_wrap:max_kadane;
    }
    private static int kadane(int ar[],int N){
        int max=0;
        int min=0;
        for(int i=0;i<N;i++){
            min=min+ar[i];
            if(max<min){
                max=min;
            }
            if(min<0){
                min=0;
            }
        }
        return max;
    }
}