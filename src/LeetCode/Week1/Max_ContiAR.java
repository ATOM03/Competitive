package LeetCode.Week1;

public class Max_ContiAR {
    public static void main(String[] args) {
        int ar[]={-2,-1};
        System.out.println(kadane(ar));
    }

    private static int kadane(int[] ar) {

        int max_so_far=Integer.MIN_VALUE;
        int max=0;
        for (int i = 0; i <ar.length ; i++) {
            max=max+ar[i];

            if(max_so_far<max)
                max_so_far=max;
            if(max<0){
                max=0;
            }
        }
        return max_so_far;
    }
}
