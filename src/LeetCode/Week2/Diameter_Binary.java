package LeetCode.Week2;

public class Diameter_Binary {
    public static void main(String[] args) {
        Binary_tree tree=new Binary_tree();
        tree.root=new Node(1);
        tree.root.left=new Node(2);
        tree.root.right=new Node(3);
        tree.root.left.left=new Node(4);
        tree.root.left.right=new Node(5);
//        tree.display(tree.root);
//        System.out.println(tree.height(tree.root.left));
        System.out.println("Diameter of Tree is : " +tree.Diameter(tree.root));
    }

}
class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data=data;
        left=null;
        right=null;
    }
}
class Binary_tree{

    public Node root;
    public void display(Node node){

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
    public int height(Node node){
        if(node==null){
            return 0;
        }
        return (1+Math.max(height(node.left),height(node.right)));
    }
    public int Diameter(Node node){
        if(node==null){
            return 0;
        }
        int left=height(node.left);
        int right=height(node.right);

        int leftDiameter=Diameter(node.left);
        int rightDiameter=Diameter(node.right);

        return (Math.max(left+right,Math.max(leftDiameter,rightDiameter)));
    }
}
