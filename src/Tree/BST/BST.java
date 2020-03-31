package Tree.BST;

public class BST {
    private class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;

        }
    }
    private Node root;
    public BST(int ar[]){
        this.root=constrution(ar,0,ar.length-1);
    }

    private Node constrution(int[] ar, int li, int hi) {
        if(li>hi){
            return null;
        }
        int mid=(li+hi)/2;
        Node nn=new Node(ar[mid]);
        nn.left=constrution(ar,li,mid-1);
        nn.right=constrution(ar,mid+1,hi);

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
