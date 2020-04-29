package LeetCode.Week2;

import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;

public class Stone_weight {
    public static void main(String[] args) {
        int stones[]={2,7,4,1,8,1};
        System.out.println(weight(stones));

    }

    private static int weight(int[] stones) {
      if(stones==null)
          return 0;
        PriorityQueue<Integer>pq=new PriorityQueue<>(Collections.reverseOrder());
        for (int i = 0; i <stones.length ; i++) {
            pq.add(stones[i]);
        }
        System.out.println(pq);
        while(pq.size()>1){
            int first=pq.poll();
            int second=pq.poll();
            if(first!=second){
                int rem=Math.abs(first-second);
                pq.add(rem);
            }
        }
        return pq.size()==1 ? pq.poll():0;
    }
}
