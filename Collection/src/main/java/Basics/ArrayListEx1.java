/**
 * 1. 작성자 : Dani
 * 2. 작성일 : 12월 10일
 * 3. ArrayList의 배열의 공간 알아보기
 */
package Basics;

import java.util.ArrayList;
import java.util.Vector;

public class ArrayListEx1 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("이름1");
        list.add("이름2");
        list.add("이름3");
        list.add("이름4");
        System.out.println(list.size()); // 요소의 갯수


        Vector<String> vc = new Vector<>(list); // ArrayList -> Vector로 변환
        System.out.println(vc.capacity()); // 배열의 공간
        vc.add("이름5");
        System.out.println(vc.capacity()); // 2배로 증가

        Vector<Integer> vc1 = new Vector<>();
        System.out.println(vc1.capacity()); // 처음부터 10의 공간을 부여 받음
        for(int i=1; i<12; i++){
            vc1.add(i);
        }
        System.out.println(vc1.capacity()); // 요소의 갯수가 11개가 되면 공간이 11이 아닌 20이 됨

    }
}
