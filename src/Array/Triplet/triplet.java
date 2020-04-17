package Array.Triplet;

import java.util.Arrays;
import java.util.Scanner;

public class triplet {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int ar[]=new int [N];
        for (int i = 0; i <N ; i++) {
            ar[i]=sc.nextInt();
        }
        //time complexity(O(n3))
//        triplt1(ar,N);
        triplt2(ar,N);
    }

    private static void triplt2(int[] ar, int n) {
        Arrays.sort(ar);
        for (int i = 0; i <n ; i++) {
            int l=i+1;
            int r=n-1;
            int x=ar[i];
            while(l<r){
                if(x+ar[l]+ar[r]==0){
                    System.out.println(x+" "+ar[l]+" "+ar[r]);
                    l++;
                    r--;
                }
                else if(x+ar[l]+ar[r]<0)
                    l++;
                else
                    r--;
            }

        }
    }

    private static void triplt1(int[] ar,int N) {
        for (int i = 0; i <N ; i++) {
            for (int j = i+1; j <N ; j++) {
                for (int k = j+1; k <N ; k++) {
                    if(ar[i]+ar[j]+ar[k]==0){
                        System.out.println(ar[i]+" "+ar[j]+" "+ar[k]);
                    }
                }
            }
        }
    }
}
