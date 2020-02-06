package Array.rotation.Triplets;

//import java.sql.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Sum3Tripet {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int ar[]=new int [N];
        for(int i=0;i<N;i++)
            ar[i]=sc.nextInt();
        int Target=sc.nextInt();
        Arrays.sort(ar);
//        for (int i=0;i<N;i++){
//            System.out.print(ar[i]+" ");
//        }
        sum3riplet(ar,Target);
    }

    private static void sum3riplet(int[] ar, int target) {
        int l,r;
        for(int i=0;i<ar.length-2;i++){
            l=i+1;
            r=ar.length-1;
            int x=ar[i];
            while(l<r){
                if(x+ar[l]+ar[r]==target){
                    System.out.println(ar[i]+" , "+ar[l]+" and "+ar[r]);
                    l++;
                    r--;
//                    return;
                }
                else if(x+ar[l]+ar[r]<target)
                    l++;
                else
                    r--;
            }
//            return;
        }
    }
}
