package LeetCode.Week2;

import java.util.HashMap;

public class Contigous_Array {
    public static void main(String[] args) {
        int ar[]={0,0,1};
        System.out.println(kadan(ar));
        System.out.println(brut_force(ar));
    }

    private static int brut_force(int[] ar) {
        int length=0;
        for (int  i = 0; i <ar.length ; i++) {
            int zeros=0,ones=0;
            for (int j = i; j <ar.length ; j++) {
                if(ar[j]==0)
                    zeros++;
                else if(ar[j]==1){
                    ones++;
                }
                if(zeros==ones)
                    length=Math.max(length,j-i+1);
            }
        }
        return length;
    }

    private static int kadan(int[] ar) {
        HashMap<Integer,Integer>map=new HashMap<>();
        map.put(0,-1);
        int length=0;
        int sum=0;
        for (int i = 0; i <ar.length ; i++) {
            sum+=ar[i]==0?-1:1;
            if(map.containsKey(sum))
                length=Math.max(length,i-map.get(sum));
            else
                map.put(sum,i);
        }
        return length;
    }
}
