package Tree.BST;

public class PreOrder {
    private class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
            this.left=this.right=null;
        }
    }
    private Node root;
    class Index{
       int index=0;
    }
    public PreOrder(int ar[],int size){
        Index index=new Index();
        this.root=construction(ar,index,0,ar.length-1,ar.length);
    }

    private Node construction(int[] ar, Index index, int low, int high, int size) {
        if(index.index>=size || low>high){
            return null;
        }
        //Create a Root node
        Node nn=new Node(ar[index.index]);
        index.index++;

        //if there is only one elment on the array
        if(low==high){
            return nn;
        }
        int i;
        for (i=low;i<high;i++){
            if(ar[i]>nn.data)
                break;
        }
        nn.left=construction(ar,index,index.index,i-1,size);
        nn.right=construction(ar,index,i,high,size);
        return nn;
    }
    public void display(){
        display(this.root);
    }

    private void display(Node node) {

        if(node==null){
            return;
        }
        String str="";
        if(node.left==null){
            str+="End";
        }else{
            str+=node.left.data;
        }

        str+="=>"+node.data+"<=";
        if(node.right==null){
            str+="End";
        }else{
            str+=node.right.data;
        }
        System.out.println(str);

        display(node.left);
        display(node.right);
    }
}
