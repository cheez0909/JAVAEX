/**
 * 1. 작성자 : Dani
 * 2. 작성일 : 12월 10일
 * 3. HashMap 기본 문법
 */
package Basics;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapEx1 {
    public static void main(String[] args) {
        HashMap<Integer, String> member = new HashMap<>();
        member.put(1, "홍길동");
        member.put(2, "이순신");
        member.put(3, "유관순");
        member.put(3, "홍길동"); // 키값은 중복될 수 없음
        member.put(4, "정도전");

        System.out.println(member.size()); // 4 중복된 키값은 데이터가 덮어진다.

        System.out.println("==Iterator 이용해서 반환==");
        Set<Integer> integers = member.keySet(); // 키값을 Set으로 받음
        Iterator<Integer> iterator = integers.iterator(); // 읽어오기
        while (iterator.hasNext()){
            Integer key = iterator.next();
            String value = member.get(key);
            System.out.println(key + ", " + value);
        }

        System.out.println("==Map.Entry로 반환==");
        Set<Map.Entry<Integer, String>> entries = member.entrySet();
        Iterator<Map.Entry<Integer, String>> iterator1 = entries.iterator();
        while (iterator1.hasNext()){
            Map.Entry<Integer, String> next = iterator1.next();
            System.out.println(next.getKey()+", "+next.getValue());
        }
    }
}
