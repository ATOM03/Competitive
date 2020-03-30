package Tree.Generic_Tree;

import java.util.ArrayList;
import java.util.Scanner;

public class TreeConst {
    private class Node{
        int data;
        ArrayList<Node> children;
        Node(int data){
            this.data=data;
            this.children=new ArrayList<>();
        }
    }
    private Node root;
    private int size;

    TreeConst(){
        Scanner sc=new Scanner(System.in);
        this.root=takeInput(sc,null,0);
    }

    private Node takeInput(Scanner sc, Node parent, int i) {
        if(parent==null){
            System.out.println("Enter The Root Data : ");
        }else{
            System.out.println("Enter the Data for "+parent.data);
        }
        int nodeData=sc.nextInt();
        Node node=new Node(nodeData);
        this.size++;
        System.out.println("Enter the no. of Children for "+node.data+" : ");
        int children=sc.nextInt();
        for (int j=0;j<children;j++){
            Node child=takeInput(sc,node,i);
            node.children.add(child);
        }
        return node;
    }
    public void display(){
        display(this.root);
    }

    private void display(Node node) {
        String str=node.data+" => ";
        for (int i = 0; i <node.children.size() ; i++) {
            str=str+node.children.get(i).data+", ";
        }
        str=str+"END";
        System.out.println(str);
        for (int i = 0; i < node.children.size(); i++) {
            display(node.children.get(i));
        }
    }
}
