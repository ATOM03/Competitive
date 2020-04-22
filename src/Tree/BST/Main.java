package Tree.BST;

public class Main {
    public static void main(String[] args) {
        int ar[]={10,20,30,40,50,60};
        BST tree=new BST(ar);
        tree.display();
//        tree.min_value();
        System.out.println(tree.lca(40,60));
//        int ar[]={10,5,1,7,40,50};
//        PreOrder tree=new PreOrder(ar,ar.length);
//        tree.display();
    }
}
