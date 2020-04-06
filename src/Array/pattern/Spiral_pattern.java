package Array.pattern;

import java.util.Scanner;

public class Spiral_pattern {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int ar[][]=new int[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j <N ; j++) {
                ar[i][j]=sc.nextInt();
            }
        }
        spiral(ar,N);
    }

    private static void spiral(int[][] ar, int n) {
        int left=0,right=n-1,down=0,up=n-1;
        while(left<right && down<up) {
            for (int i = left; i <= right; i++) {
                System.out.print(ar[down][i]+" ");
            }
            down++;
            for (int i = down; i <=up ; i++) {
                System.out.print(ar[i][right]+" ");
            }
            right--;
            for (int i = right; i >=left ; i--) {
                System.out.print(ar[up][i]+" ");
            }
            up--;
            for (int i = up; i >=down ; i--) {
                System.out.print(ar[i][left]+" ");
            }
            left++;
        }
    }
}
