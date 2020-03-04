package Dynamic_Progrmming;

import java.util.Scanner;

public class Rod_Cutting {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int ar[]=new int[N];
        for (int i = 0; i <N ; i++) {
            ar[i]=sc.nextInt();
        }
        System.out.println("Top-Down Approch "+optimal_sol(ar,N));//is top-down approch
        System.out.println("Bottom-Up Approch "+tabluar(ar,N));
    }

    private static int tabluar(int[] ar, int n) {
        int r[]=new int[n+1];
        r[0]=0;

        for (int i = 0; i <n; i++) {
            int q=Integer.MIN_VALUE;
            for (int j = 0; j <=i ; j++) {
                q=Math.max(q,ar[j]+r[i-j]);
            }
            r[i+1]=q;

        }return r[n];
    }

    private static int optimal_sol(int[] ar, int n) {
        if(n==0)
            return 0;
        int q=Integer.MIN_VALUE;
        for (int i = 0; i <n ; i++) {
            q=Math.max(q,ar[i]+optimal_sol(ar,n-i-1));
        }
        return q;
    }
}
