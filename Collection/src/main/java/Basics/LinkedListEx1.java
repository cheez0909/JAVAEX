/**
 * 1. 작성자 : Dani
 * 2. 작성일 : 12월 10일
 * 3. LinkedList와 ArrayList추가 삭제시간 비교해보기
 * 순차적으로 추가는 ArrayList가 빠르지만
 * 중간 추가는  LinkedList가 빠르다
 */
package Basics;

import java.util.*;

public class LinkedListEx1 {
    public static void main(String[] args) {
        ArrayList al = new ArrayList(200000);
        LinkedList li = new LinkedList();

        System.out.println("==순차적으로 추가하기==");
        System.out.println("ArrayList : " + add1(al));
        System.out.println("LinkedList : " + add1(li));
        System.out.println();

        System.out.println("==중간에 추가하기==");
        System.out.println("ArrayList : " + add2(al));
        System.out.println("LinkedList : " + add2(li));
        System.out.println();
    }

    /**
     * 순차적으로 추가하는 메서드
     */
    private static long add1(List list) {
        long start = System.currentTimeMillis();
        for(int i = 0; i<1000000; i++){
            list.add(i + "");
        }
        long end = System.currentTimeMillis();
        return end - start;
    }
    /**
     * 중간에 추가하는 메서드
     */
    private static long add2(List list) {
        long start = System.currentTimeMillis();
        for(int i = 0; i<10000; i++){
            list.add(500, "X");
        }
        long end = System.currentTimeMillis();
        return end - start;
    }
}
