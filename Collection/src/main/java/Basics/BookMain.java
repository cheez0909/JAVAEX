
/**
 * 1. 작성자 : Dani
 * 2. 작성일 : 12월 10일
 * 3. TreeSet과 Comparator 재정의
 */
package Basics;

import java.util.*;

class Des implements Comparator<String>{
    @Override
    public int compare(String o1, String o2) {
        return o1.compareTo(o2) * -1;
    }
}
public class BookMain {
    public static void main(String[] args) {

        /**
         * Book클래스 내부에 정렬 메서드가 재정의 되어 있음
         */
        TreeSet<Book> set = new TreeSet<Book>();
        set.add(new Book("작가6", 2000));
        set.add(new Book("작가2", 5000));
        set.add(new Book("작가4", 2000));
        set.add(new Book("작가4", 2000));
        set.add(new Book("작가1", 6000));


        Iterator<Book> iterator = set.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }


        /**
         * 정렬 메서드를 추가함
         */
        TreeSet<String> set1 = new TreeSet<String>(new Des());
        set1.add("작가6");
        set1.add("작가3");
        set1.add("작가98");
        set1.add("작가1");

        Iterator<String> iterator1 = set1.iterator();
        while (iterator1.hasNext()){
            System.out.println(iterator1.next());
        }

    }
}
