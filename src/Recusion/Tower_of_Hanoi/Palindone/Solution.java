package Recusion.Tower_of_Hanoi.Palindone;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int N=s.length();
        boolean flag=palindome(s,0,N-1);
        if(flag) {
        System.out.println(s+" is palindome");
        }
        else
            System.out.println(s+" is not palindome");
    }

    private static boolean palindome(String s, int si, int end) {
        if(si>end){
            return true;
        }
        char A=s.charAt(si);
        char B=s.charAt(end);
        if(A==B){
            return palindome(s,si+1,end-1);
        }
        else{
            return false;
        }
    }
}
