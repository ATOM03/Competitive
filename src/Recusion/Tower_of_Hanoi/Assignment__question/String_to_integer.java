package Recusion.Tower_of_Hanoi.Assignment__question;

import java.util.Scanner;

public class String_to_integer {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        Str_int(0,s);
    }

    private static void Str_int(int processed, String unprocessed) {
        if(unprocessed.isEmpty()){
            processed=processed/10;
            System.out.println(processed);
            return;
        }
        String s=unprocessed.substring(0,1);
        int i=Integer.parseInt(s);
        Str_int((processed+i)*10,unprocessed.substring(1));
    }
}
