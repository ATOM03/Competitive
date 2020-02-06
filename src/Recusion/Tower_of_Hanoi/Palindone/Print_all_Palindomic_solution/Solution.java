package Recusion.Tower_of_Hanoi.Palindone.Print_all_Palindomic_solution;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String input=sc.next();

        allPalindome(input);
    }

    private static void allPalindome(String input) {
        int n=input.length();
        ArrayList<ArrayList<String>>allPart=new ArrayList<>();
        Deque<String>currPart=new LinkedList<>();
        allPalindome(allPart,currPart,0,n,input);
        System.out.println(allPart);

        for (int i=0;i<allPart.size();i++){
            for (int j=0;j<allPart.get(i).size();j++){
                System.out.print(allPart.get(i).get(j)+" ");
            }
            System.out.println();
        }
    }

    private static void allPalindome(ArrayList<ArrayList<String>> allPart, Deque<String> currPart, int start, int n, String input) {
        if(start>=n){
            allPart.add(new ArrayList<>(currPart));
            return;
        }
        for(int i=start;i<n;i++){
            if(isPalindome(input,start,i)){
                currPart.addLast(input.substring(start,i+1));
                allPalindome(allPart,currPart,i+1,n,input);
                currPart.removeLast();
            }
        }
    }

    private static boolean isPalindome(String input, int start, int i) {
        while (start<i){
            if(input.charAt(start++)!=input.charAt(i--))
                return false;
        }
        return true;
    }
}
