package Recusion.Tower_of_Hanoi.Staircase;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();

        System.out.println(staircase(N));
    }

    private static int staircase(int n) {
        if(n==0 || n==1)
            return 1;
        else if(n==2)
            return 2;
        else
            return staircase(n-3)+staircase(n-2)+staircase(n-1);
    }
}
