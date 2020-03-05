package Dynamic_Progrmming;

import java.util.Scanner;

public class Binomial_Coefficient {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();

        int numerator=fact(n);
        int denominator=fact(n-k)*fact(k);
        int num=numerator/denominator;
        System.out.println("By Me : " +num);
        System.out.println("Top-Down Approach : "+tdBin(n,k));
        System.out.println("Bottom-up Approach : " +buBin(n,k));
    }

    private static int buBin(int n, int k) {
        int dp[][]=new int[n+1][k+1];
        for (int i = 0; i <=n ; i++) {
            for (int j = 0; j <=min(i,k) ; j++) {
                if(j==0||j==i)
                    dp[i][j]=1;
                else
                    dp[i][j]=dp[i-1][j-1]+dp[i-1][j];
            }
        }
        return dp[n][k];

    }

    private static int min(int a, int b) {
        return (a<b)? a:b;
    }

    //Top Down Approch
    private static int tdBin(int n, int k) {
        if(k==0||k==n)
            return 1;

        return tdBin(n-1,k-1)+tdBin(n-1,k);
    }

    //by me
    private static int fact(int n) {
        if(n<=0)
            return 1;
        return n*fact(n-1);
    }
}
