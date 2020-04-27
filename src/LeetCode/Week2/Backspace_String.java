package LeetCode.Week2;

import java.util.Stack;

public class Backspace_String {
    public static void main(String[] args) {
        String s1="a#c";
        String s2="b";
        System.out.println(isEqual(s1,s2));
//        System.out.println(isEqual1(s1,s2));
    }
//1st approch
    private static boolean isEqual(String s1, String s2) {
        char []letters=s1.toCharArray();
        String new_String1="";
        for (int i = 0; i < letters.length; i++) {
            if(letters[i]=='#'){
                if(new_String1.length()>=1) {
                    new_String1 = new_String1.substring(0, new_String1.length() - 1);
                }
            }else{
                new_String1+=letters[i];
            }
        }
        char []letters1=s2.toCharArray();
        String new_String2="";
        for (int i = 0; i < letters1.length; i++) {
            if(letters1[i]=='#'){
                if(new_String2.length()>=1) {
                    new_String2 = new_String2.substring(0, new_String2.length() - 1);
                }
            }else{
                new_String2+=letters1[i];
            }
        }
        if(new_String1.equals(new_String2)){
            return true;
        }else{
            return false;
        }
    }
    //2nd approch
    //Use Stack then reverse the Stack
}
