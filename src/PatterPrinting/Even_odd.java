package PatterPrinting;

public class Even_odd {
    public static void main(String[] args) {
        int N=7;
        pattern(N);
    }

    private static void pattern(int N) {
        int i=N;
        while(i>0){
            if(i%2!=0){
                for (int j = 1; j <=N ; j++) {
                    System.out.print("1");
                }
                System.out.println();
            }
            else{
                for (int j = 1; j <=N ; j++) {
                    System.out.print("0");
                }
                System.out.println();
                N=N-2;
            }
            i--;
        }
    }
}
