package Dynamic_Progrmming;

import java.util.Scanner;

public class Permutation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        System.out.println("Permutatuion : " +perm(n,k));
    }

    private static int perm(int n, int k) {
        int dp[]=new int [n+1];
        dp[0]=1;
        for (int i = 1; i <=n ; i++) {
            dp[i]=i*dp[i-1];
        }
        return dp[n]/dp[n-k];
    }
}
