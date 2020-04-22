package LeetCode.Week1;

public class Move_Zero {
    public static void main(String[] args) {
        int ar[]={0,0,1};
        move(ar);
        for (int i = 0; i <ar.length ; i++) {
            System.out.print(ar[i]+",");
        }
    }

    private static void move(int[] ar) {
        int N=ar.length;
        int count=0;
        for (int i = 0; i < N; i++) {
            if(ar[i]!=0)
                ar[count++]=ar[i];
        }

        while(count<N){
            ar[count++]=0;
        }
    }
}
