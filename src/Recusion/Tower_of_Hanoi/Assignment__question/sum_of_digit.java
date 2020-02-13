package Recusion.Tower_of_Hanoi.Assignment__question;

import java.util.Scanner;

public class sum_of_digit {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        digit(0,s);
    }

    private static void digit(int processed, String unprocessed) {
        if(unprocessed.isEmpty()){
            System.out.println(processed);
            return;
        }
        String ch=unprocessed.substring(0,1);
        int i=Integer.parseInt(ch);
        digit(processed+i,unprocessed.substring(1));
    }
}
