package Recusion.Tower_of_Hanoi.Code_String;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String input=sc.next();

        ArrayList<String> output=new ArrayList<>();
        Code_of_String("",input,output);
        System.out.println(output);
    }

    private static void Code_of_String(String processed, String unprocessed, ArrayList<String> output) {
        if (unprocessed.isEmpty()) {
            output.add(processed);
            return;
        }
        char ch = unprocessed.charAt(0);
        char code = (char) (ch + 'a' - '1');
        Code_of_String(processed + code, unprocessed.substring(1), output);

        if (unprocessed.length() >= 2 && ch <= '2') {
            int i = Integer.parseInt(unprocessed.substring(0, 2));
            if (i > 0 && i <= 26) {
                code = (char) (i + 'a' - 1);
                Code_of_String(processed + code, unprocessed.substring(2), output);
            }
        }
    }
}
