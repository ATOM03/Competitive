package PriorityQueue.Heap;

import java.util.ArrayList;

public class MinHeap {
    ArrayList<Integer> list=new ArrayList<>();
    public void add(int x){
        list.add(x);
        upheapify(list.size()-1);
    }

    private void upheapify(int ci) {
        int pi=(ci-1)/2;
        if(list.get(ci)<list.get(pi)){
            swap(ci,pi);
            upheapify(pi);
        }
    }

    private void swap(int i, int j) {
        int ith=list.get(i);
        int jth=list.get(j);
        list.set(i,jth);
        list.set(j,ith);
    }
    public void display(){
        System.out.println(list);
    }
    public void remove(){
        swap(0,list.size()-1);
        downheapify(0);
        System.out.println(list.remove(list.size()-1));
        
    }

    private void downheapify(int pi) {
        int lci=2*pi+1;
        int rci=2*pi+2;

        int mini=pi;
        if(lci<list.size() && list.get(lci)<list.get(mini)){
            mini=lci;
        }
        if(rci<list.size() && list.get(rci)<list.get(mini)){
            mini=rci;
        }

        if(mini!=pi){
            swap(mini,pi);
            downheapify(mini);
        }
    }
}
