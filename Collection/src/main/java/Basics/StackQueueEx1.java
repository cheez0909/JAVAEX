/**
 * 1. 작성자 : Dani
 * 2. 작성일 : 12월 10일
 * 3. 스택과 큐 비교해보기
 */
package Basics;

import java.util.PriorityQueue;
import java.util.Stack;

public class StackQueueEx1 {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);

        /**
         * LIFO의 구조로 먼저 들어온 값이 먼저 호출된다.
         */
        while (!stack.isEmpty()){
            System.out.println(stack.pop());
        }

        System.out.println("========");
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        priorityQueue.offer(545);
        priorityQueue.offer(2);
        priorityQueue.offer(45);
        priorityQueue.offer(30);
        priorityQueue.offer(775);

        /**
         * 순서를 가짐
         * Integer -> 오름차순
         * Comparable 인터페이스의 int compareTo 메서드
         */
        while (!priorityQueue.isEmpty()){
            System.out.println(priorityQueue.poll());
        }

    }
}
