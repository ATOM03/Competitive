package Dynamic_Progrmming;

import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int ar[]=new int[N+1];

        System.out.println(fact(ar));
    }

    private static int fact(int[] ar) {
        ar[0]=1;

        for (int i=1;i<ar.length;i++)
            ar[i]=ar[i-1]*i;

        return ar[ar.length-1];
    }
}
