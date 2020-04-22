package LinkedList;

public class LL {
    private Node head;
    private Node tail;
    private int size=0;
    private int carry=0;

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
    public void append(){
        Node oddStart=null;
        Node oddTail=null;
        Node evenStart=null;
        Node evenTail=null;
        Node curr=this.head;
        while(curr!=null){
            if(curr.data%2!=0){
                if(oddStart==null){
                    oddStart=curr;
                    oddTail=curr;
                }else{
                    oddTail.next=curr;
                    oddTail=curr;
                }
            }
            else{
                if(evenStart==null){
                    evenStart=curr;
                    evenTail=curr;
                }else{
                    evenTail.next=curr;
                    evenTail=curr;
                }
            }
            curr=curr.next;
        }
        oddTail.next=evenStart;
        this.head=oddStart;
    }
    public void sum(LL list1,LL list2){
       Node temp1=list1.head;
       Node temp2=list2.head;
       sum(temp1,temp2);
       if(this.carry!=0) {
           addFirst(carry);
       }
    }

    private void sum(Node head1, Node head2) {
        if(head1==null)
            return;
        sum(head1.next,head2.next);
        int sum=head1.data+head2.data+carry;
        carry=sum/10;
        sum=sum%10;
        addFirst(sum);
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
