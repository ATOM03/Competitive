package Array.rotation.Pair_of_Rose;
import java.util.Arrays;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int tc=sc.nextInt();
        while(tc-->0){
            int N=sc.nextInt();
            int ar[]=new int[N];
            for (int i = 0; i < N; i++) {
                ar[i]=sc.nextInt();
            }
            int target=sc.nextInt();
            Arrays.sort(ar);
            Sum2(ar,target,N);
        }
    }

    private static void Sum2(int[] ar, int target,int N) {
//        ArrayList<ArrayList<Integer>> alist=new ArrayList<>(N);
        int min=Integer.MAX_VALUE;
        int A=0,B=0;
        //Time Complexity O(nlogn)
        for (int i = 0; i < N-1; i++) {
                if(ar[i+1]+ar[i]==target){
                    if(Math.abs(ar[i]-ar[i+1])<min)
                        min=Math.abs(ar[i]-ar[i+1]);
                        A=ar[i];
                        B=ar[i+1];
//                    ArrayList<Integer> a1=new ArrayList<>(2);
//                    a1.add(ar[i]);
//                    a1.add(ar[j]);
//                    alist.add(a1);
            }
        }
        System.out.println("Deepak should buy roses whose prices are " +A +" and "+ B+".");
//        System.out.println(alist);
    }
}
