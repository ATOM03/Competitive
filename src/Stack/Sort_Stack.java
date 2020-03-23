package Stack;
// { Driver Code Starts
import java.util.Scanner;
import java.util.Stack;
class SortedStack{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            Stack<Integer> s=new Stack<>();
            int n=sc.nextInt();
            while(n-->0)
                s.push(sc.nextInt());
            GfG g=new GfG();
            Stack<Integer> a=g.sort(s);
            while(!a.empty()){
                System.out.print(a.peek()+" ");
                a.pop();
            }
            System.out.println();
        }
    }
}// } Driver Code Ends
/*Complete the function below*/
class GfG{
    public Stack<Integer> sort(Stack<Integer> s)
    {
        StackSort(s);
        return s;
        //add code here.
    }

    private void StackSort(Stack<Integer> s) {
        if(s.isEmpty()){
            return;
        }
        int temp=s.pop();
        StackSort(s);
        StackInsert(s,temp);
    }

    private void StackInsert(Stack<Integer> s,int element) {
        if(s.isEmpty() || element > s.peek() ){
            s.push(element);
            return;
        }else{
            int temp=s.pop();
            StackInsert(s,element);
            s.push(temp);
        }
    }
}