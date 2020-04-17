package LinkedList;

public class Main {
    public static void main(String[] args) {
        LL list=new LL();
        list.addLast(1);
        list.addLast(2);
        list.addLast(3);
        list.addLast(4);
        list.addLast(5);
        list.addLast(6);
        list.display();
//        System.out.println(list.size());
        list.append(5);
        list.display();
    }
}
