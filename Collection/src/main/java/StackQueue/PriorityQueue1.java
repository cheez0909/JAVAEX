package StackQueue;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueue1 {
    public static void main(String[] args) {
        Queue pq = new PriorityQueue();
        pq.offer(15);
        pq.offer(9);
        pq.offer(7);
        pq.offer(8);
        pq.offer(10);

        System.out.println(pq);

        Object obj = null;

        // Queue에서 .poll() 객체를 꺼내서 반환
        while((obj=pq.poll()) != null){
            System.out.println(obj);
        }

        System.out.println(pq);
    }
}
