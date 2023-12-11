/**
 * 1. 작성자 : Dani
 * 2. 작성일 : 12월 10일
 * 3. Iterator 기본 문법
 */
package Basics;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;

public class IteratorEx1 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("이름1");
        list.add("이름2");
        list.add("이름3");
        list.add("이름4");

        /**
         * 요소 불러오기
         * 재사용X
         */
        /*
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()){ // 다음 요소가 있는지?
            System.out.println(iterator.next()); // 다음요소 읽어오기
            iterator.remove(); // 요소 삭제
        }
        System.out.println("요소의 개수 : " + list.size()); // 0 전부 삭제 됐다.
        */

        /**
         * Iterator의 향상된 버전
         * 양방향으로 조회 가능
         * List 인터페이스를 구현한 컬렉션 클래스
         */
        ListIterator<String> stringListIterator = list.listIterator();
        while (stringListIterator.hasNext()){
            System.out.println(stringListIterator.next());
        }

        while (stringListIterator.hasPrevious()){
            System.out.println(stringListIterator.previous());
        }


    }
}
