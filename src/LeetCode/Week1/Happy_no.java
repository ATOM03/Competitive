package LeetCode.Week1;

import java.util.HashSet;
import java.util.Scanner;

public class Happy_no {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        System.out.println(ishappy(N));
    }
    private  static  int count(int n){
        int sq=0;
        while(n>0){
            int digit=n%10;
            sq+=digit*digit;
            n=n/10;
        }
        return sq;
    }

    private static boolean ishappy(int n) {
        HashSet<Integer>s=new HashSet<>();
        s.add(n);
        while (true){
            if(n==1)
                return true;

            n=count(n);
            if(s.contains(n)){
                return false;
            }
            s.add(n);
        }
    }
}
