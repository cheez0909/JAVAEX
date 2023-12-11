/**
 * 1. 작성자 : Dani
 * 2. 작성일 : 12월 10일
 * 3. TreeMap 기본 문법
 */
package Basics;

import java.util.*;

class desc implements Comparator<Integer>{

    @Override
    public int compare(Integer o1, Integer o2) {
        return o1.compareTo(o2) * -1;
    }
}
public class TreeMapEx1 {
    public static void main(String[] args) {
        TreeMap<Integer, String> member = new TreeMap<>(new desc());
        member.put(1, "홍길동");
        member.put(2, "이순신");
        member.put(3, "유관순");
        member.put(3, "홍길동");
        member.put(4, "정도전");

        Set<Map.Entry<Integer, String>> entries = member.entrySet();
        Iterator<Map.Entry<Integer, String>> iterator = entries.iterator();
        while (iterator.hasNext()){
            Map.Entry<Integer, String> next = iterator.next();
            System.out.println(next.getKey() + ", " + next.getValue());
        }
    }
}
