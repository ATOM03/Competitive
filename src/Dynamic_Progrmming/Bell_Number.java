package Dynamic_Progrmming;

public class Bell_Number {
    public static void main(String[] args) {
//        System.out.println(bell(3,2));
        System.out.println(bell(3));
    }

    private static int bell(int n) {
        int dp[][]=new int[n+1][n+1];
        dp[0][0]=1;

        for (int i = 1; i <=n ; i++) {
            dp[i][0]=dp[i-1][i-1];

            for (int j = 1; j <=i ; j++) {
                dp[i][j]=dp[i-1][j-1]+dp[i][j-1];
            }
        }
        return dp[n][0];
    }

    private static int bell(int n, int k) {
        int dp[][]=new int [n+1][k+1];

        for (int i = 0; i <=n ; i++) {
            dp[i][0]=0;
        }
        for (int i = 0; i <=k ; i++) {
            dp[0][i]=0;
        }
        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=k ; j++) {
                if(i==1 || j==1)
                    dp[i][j]=1;
                else
                    dp[i][j]=j*dp[i-1][j]+dp[i-1][j-1];
            }
        }
        return dp[n][k];
    }
}
