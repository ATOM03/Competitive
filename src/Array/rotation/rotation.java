package Array.rotation;

import java.util.Scanner;

public class rotation {
   public static void juggling_rot(int ar[],int d,int n){
        int i ,j,k,temp;
        int g_c_d=gcd(d,n);
        for(i= 0;i <g_c_d;i++){
            temp=ar[i];
            j=i;
            while(true){
                k=j+d;
                if(k>=n){
                    k=k-n;
                }if(k==i)break;

                ar[j]=ar[k];
                j=k;
            }
            ar[j]=temp;
        }
    }
    private static int gcd(int a, int b) {
       if(b==0)return a;

       else
           return gcd(b,a%b);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
//        int d =sc.nextInt();
        int n=sc.nextInt();
        int ar[]=new int[n];
        for (int i = 0 ; i < n ;i ++){
            ar[i]=sc.nextInt();
        }
//        juggling_rot(ar,d,n);
        rot(ar);
        for(int i=0;i<ar.length;i++){
            System.out.print(ar[i]+" ");
        }
        System.out.println();
//        int ar1[]=rot(ar,d,n);
//        for (int i = 0; i < ar1.length; i++) {
//            System.out.print(ar1[i]+" ");
//        }
//        System.out.println();
    }

    private static void rot(int[] ar) {
        int n =ar.length;
        int temp=ar[n-1];
       int i;
       for( i =n-1;i>0;i--){
           ar[i]=ar[i-1];
       }
       ar[i]=temp;
    }

    private static int[] rot(int[] ar, int d, int n) {
        int ar1[]=new int[d];
        for(int i=0;i <d ;i++){
            ar1[i]=ar[i];
        }
        for(int i=d;i<n;i++){
            ar[i-d]=ar[i];
        }
        for(int i=0;i<ar1.length;i++){
            ar[n-d+i]=ar1[i];
        }
        return ar;
    }
}
