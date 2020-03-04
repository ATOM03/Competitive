package Recusion.Tower_of_Hanoi.Assignment__question;

import java.util.Scanner;

public class Duplic {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String input=sc.next();
        dupli("",input,0);
    }

    private static void dupli(String processed, String unprocessed, int i) {
        if(i==unprocessed.length()-1){
            char ch=unprocessed.charAt(i);
            System.out.println(processed+ch);
            return;
        }
        char ch=unprocessed.charAt(i);
        char ch1=unprocessed.charAt(i+1);
        if(ch==ch1){
            dupli(processed+ch,unprocessed,i+2);
        }
        else {
            dupli(processed + ch, unprocessed, i + 1);
        }
    }
}
