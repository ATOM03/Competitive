package Array;

public class Not_Repeated {
    public static void main(String[] args) {
        int ar[]={4,1,2,1,2};
        System.out.println(Nt(ar));
    }

    private static int Nt(int[] ar) {
        int xor=ar[0];
        for (int i = 1; i <ar.length ; i++) {
            xor^=ar[i];
        }
        return xor;
    }
}
