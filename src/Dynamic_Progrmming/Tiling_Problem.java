package Dynamic_Progrmming;

import java.util.Scanner;

public class Tiling_Problem {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(tiling(n));
    }

    private static int tiling(int n) {
        int dp[]=new int[n+2];
        dp[0]=0;
        dp[1]=1;
        dp[2]=2;
        for (int i = 3; i <=n ; i++) {
            dp[i]=dp[i-1]+dp[i-2];
        }
        return dp[n];
    }
}
