package Dynamic_Progrmming;

import java.util.Scanner;

public class Ugly_number {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        System.out.println(ugly(N));
    }

    private static int ugly(int N) {
        int ugly[]=new int[N];
        int i2=0,i3=0,i5=0;
        int next_2=2;
        int next_3=3;
        int next_5=5;
        int next_ugly=1;
        ugly[0]=1;

        for (int i = 1; i <N ; i++) {
            next_ugly=Math.min(next_2,Math.min(next_3,next_5));
            ugly[i]=next_ugly;
            if(next_ugly==next_2){
                i2=i2+1;
                next_2=ugly[i2]*2;
            }
            if(next_ugly==next_3){
                i3=i3+1;
                next_3=ugly[i3]*3;
            }
            if(next_ugly==next_5){
                i5=i5+1;
                next_5=ugly[i5]*5;
            }
        }
        return next_ugly;
  }
}
