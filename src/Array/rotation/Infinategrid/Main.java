package Array.rotation.Infinategrid;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer>A=new ArrayList<>();
        ArrayList<Integer>B=new ArrayList<>();
        A.add(0); A.add(1);
        A.add(1);
        B.add(0);
        B.add(1);
        B.add(2);
        System.out.println( coverPoints(A,B));
    }
    public static int coverPoints(ArrayList<Integer> A, ArrayList<Integer> B) {
        int Count=0;
        for(int i=1;i<A.size();i++) {
            int a1 = A.get(i - 1);
            int b1 = B.get(i - 1);
            int a2 = A.get(i);
            int b2 = B.get(i);
            Count+=distance(a1,b1,a2,b2);
        }
        return Count;
    }

    private static int distance(int a1, int b1, int a2, int b2) {
        int a=Math.abs(a1-a2);
        int b=Math.abs(b1-b2);
        return Math.max(a,b);
    }
}
