package Array.rotation.Arithmetic_Progression;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int ar[]=new int[N];
        for (int i = 0; i < ar.length; i++) {
            ar[i]=sc.nextInt();
        }
        int Dif=Math.abs(ar[0]-ar[1]);
//        System.out.println(Dif);
        boolean flag=true;
        for (int i = 1; i <ar.length-1 ; i++) {
           if(Math.abs(ar[i-1]-ar[i])!=Dif) {
               flag = false;
               break;
           }
        }
        System.out.println(flag);
    }
}
