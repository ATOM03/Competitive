package Recusion.Tower_of_Hanoi.Assignment__question;

import java.util.Scanner;

public class Dupliate_star {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String input=sc.next();
        dupli("",input,0);
    }

    private static void dupli(String processed, String unprocessed,int i) {
        if(i==unprocessed.length()-2){
            char secondlast=unprocessed.charAt(i);
            processed+=secondlast;
            char last=unprocessed.charAt(i+1);
            if(secondlast==last){
                processed=processed+"*";
            }
            System.out.println(processed+last);
            return;
        }
        char ch=unprocessed.charAt(i);
        char ch1=unprocessed.charAt(i+1);
        if(ch==ch1){
            dupli(processed+ch+"*",unprocessed,i+1);
        }else {
            dupli(processed + ch, unprocessed, i + 1);
        }
    }
}
