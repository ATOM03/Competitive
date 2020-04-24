package LeetCode.Week1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class Counting_Element {
    public static void main(String[] args) {
        int ar[]={1,1,2};
        System.out.println(count(ar));
    }

    private static int count(int[] ar) {
        int N=ar.length;
        HashSet<Integer>set=new HashSet<>();
        for (int i = 0; i <N ; i++) {
            set.add(ar[i]);
        }

        int count=0;
        for (int i = 0; i < ar.length; i++) {
            int a=ar[i]+1;
            if(set.contains(a))
                count++;
        }
        return count;
    }
}
