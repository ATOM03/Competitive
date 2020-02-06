package Recusion.Tower_of_Hanoi;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        TowerOfHanoi(N,'A','C','B');
    }

    private static void TowerOfHanoi(int n, char from, char to, char Aux) {
        if(n==1){
            System.out.println("Move "+ n +" from "+from+" to "+to);
            return;
        }
        TowerOfHanoi(n-1,from,Aux,to);
        System.out.println("Move "+ n +" from "+from+" to "+to);
        TowerOfHanoi(n-1,Aux,to,from);
    }
}
