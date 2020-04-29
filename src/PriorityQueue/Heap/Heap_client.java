package PriorityQueue.Heap;

public class Heap_client {
    public static void main(String[] args) {
        MinHeap heap=new MinHeap();
        heap.add(1);
        heap.add(3);
        heap.add(6);
        heap.add(5);
        heap.add(9);
        heap.add(8);
        heap.display();
        heap.remove();
        heap.display();
    }
}
