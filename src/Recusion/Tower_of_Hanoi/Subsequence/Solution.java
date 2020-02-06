package Recusion.Tower_of_Hanoi.Subsequence;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String s=sc.next();
        int counter =subsequence("",s);
        System.out.println();
        System.out.println(counter);
    }

    private static int subsequence(String processed, String unprocessed) {
        if(unprocessed.isEmpty()){
            System.out.print(processed+" ");
            return 1;
        }
        char ch=unprocessed.charAt(0);
        int cnt=0;
        unprocessed=unprocessed.substring(1);
        cnt+=subsequence(processed,unprocessed);
        cnt+=subsequence(processed+ch,unprocessed);

        return cnt;
    }
}
