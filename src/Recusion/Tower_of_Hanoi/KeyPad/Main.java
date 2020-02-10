package Recusion.Tower_of_Hanoi.KeyPad;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        Map<String,String> keypad=new HashMap<>();
        keypad.put("1","abc");
        keypad.put("2","def");
        keypad.put("3","ghi");
        keypad.put("4","jkl");
        keypad.put("5","mno");
        keypad.put("6","pqrs");
        keypad.put("7","tuv");
        keypad.put("8","wx");
        keypad.put("9","yz");

        ArrayList<String>output=new ArrayList<>();
        letterCombination(s,output,keypad);
        for (String key:output) {
            System.out.print(key+" ");
        }
        System.out.println();
        System.out.println(output.size());
    }
    public static void letterCombination(String s,ArrayList<String> output, Map<String, String> keypad) {
        if(s.length()!=0){
            combination("",s,output,keypad);
        }
    }

    private static void combination(String combination, String digit, ArrayList<String> output, Map<String, String> keypad) {
        if(digit.length()==0){
            output.add(combination);
        }else {
            String digit_ = digit.substring(0,1);
            String letters = keypad.get(digit_);
            for (int i = 0; i < letters.length(); i++) {
                String letter = keypad.get(digit_).substring(i, i + 1);
                combination(combination + letter, digit.substring(1), output, keypad);
            }
        }
    }
}
