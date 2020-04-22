package LinkedList;

public class Main {
    public static void main(String[] args) {
        LL list1=new LL();
        LL list2=new LL();
        list1.addLast(5);
        list1.addLast(6);
        list1.addLast(3);
        list2.addLast(3);
        list2.addLast(4);
        list2.addLast(2);
        LL list3=new LL();
        list3.sum(list1,list2);
        list3.display();
//        list.addLast(1);
//        list.addLast(2);
//        list.addLast(3);
//        list.addLast(4);
//        list.addLast(5);
//        list.addLast(6);
//        list.display();
////        System.out.println(list.size());
////        list.append(5);
//        list.append();
//        list.display();
    }
}
