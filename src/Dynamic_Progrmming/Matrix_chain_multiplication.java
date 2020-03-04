package Dynamic_Progrmming;

public class Matrix_chain_multiplication {
    public static void main(String[] args) {
        int ar[]={1,2,3,4};
        System.out.println( matric_chain(ar,ar.length));
    }

    private static int matric_chain(int[] ar, int n) {

        int m[][]=new int[n][n];
        for (int i=0;i<n;i++)
            m[i][i]=0;

        int i,j,k,q,L;
        //chain length
        for(L=2;L<n;L++){
            for (i=1;i<n-L+1;i++){
                j=i+L-1;
                if(j==n)
                    continue;
                m[i][j]=Integer.MAX_VALUE;
                for (k=i;k<=j-1;k++){
                    q=m[i][k]+m[k+1][j]+ar[i-1]*ar[k]*ar[j];
                    if(q<m[i][j])
                        m[i][j]=q;
                }
            }
        }
        return m[1][n-1];
    }
}
