package Tree.BST;

public class Main {
    public static void main(String[] args) {
//        int ar[]={10,20,30,40,50,60,70};
//        BST tree=new BST(ar);
//        tree.display();
        int ar[]={10,5,1,7,40,50};
        PreOrder tree=new PreOrder(ar,ar.length);
        tree.display();
    }
}
