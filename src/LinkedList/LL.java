package LinkedList;

public class LL {
    private Node head;
    private Node tail;
    private int size=0;

    public void addFirst(int data){
        Node node=new Node(data);
        if(size==0 || head==null){
            this.head=node;
            this.tail=node;
        }else{
            node.next=this.head;
            this.head=node;
        }
        size++;
    }
    public void addLast(int data){
        Node node=new Node( data);
        if(size==0||head==null){
            addFirst(data);
        }else{
            this.tail.next=node;
            this.tail=node;
            size++;
        }
    }
    public int size(){
        return this.size;
    }
    public void append(int n){
        int size=this.size;
        int index=size-n;
        Node temp=this.head;
        for (int i = 0; i <index ; i++) {
            addLast(temp.data);
            temp=temp.next;
            head=head.next;
        }
    }
    public void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("End");
    }
    private class Node{
        int data;
        Node next;

        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
}
