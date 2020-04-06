package Array.pattern;

import java.util.Scanner;

public class Diagonal_Pattern {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int N=sc.nextInt();
        int ar[][]=new int[N][N];
        for (int i = 0; i <N ; i++) {
            for (int j = 0; j < N; j++) {
                 ar[i][j]=sc.nextInt();
            }
        }
        diagonal(ar,N);
    }

    private static void diagonal(int[][] ar, int n) {
        int i=0,j=0;
        do{
            int A=ar[i][i]*ar[i][i];
            System.out.print(A+" ");
            i++;
        }while(i<n);
        System.out.println();
        do{
            int B=ar[j][i-j-1]*ar[j][i-j-1];
            System.out.print(B+" ");
            j++;
        }while(j<n);

    }
}
