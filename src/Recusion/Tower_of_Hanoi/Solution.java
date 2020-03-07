package Recusion.Tower_of_Hanoi;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        System.out.println(TowerOfHanoi(N,"T1","T2","T3"));
    }

    private static int  TowerOfHanoi(int n, String from, String to, String Aux) {
        if(n==1){
            System.out.println("Move "+ n +"th from "+from+" to "+to);
            return 1;
        }
        int count=0;
        count+=TowerOfHanoi(n-1,from,Aux,to);
        System.out.println("Move "+ n +"th from "+from+" to "+to);
        count+=TowerOfHanoi(n-1,Aux,to,from);

        return count;
    }
}
