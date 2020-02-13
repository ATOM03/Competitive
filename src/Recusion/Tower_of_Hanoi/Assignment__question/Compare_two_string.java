package Recusion.Tower_of_Hanoi.Assignment__question;

import java.util.Scanner;

public class Compare_two_string {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str1=sc.next();
        String str2=sc.next();
        boolean flag=Reverse("",str1,str2,str2.length());
        System.out.println(flag);
    }
    public static boolean Reverse(String processed,String str1,String str2,int i){
        if(i==0){
            if(processed.equals(str1)) {
                return true;
            }
            else {
                return false;
            }
        }
        String ch=str2.substring(i-1,i);
        return Reverse(processed+ch,str1,str2,i-1);
    }
}
