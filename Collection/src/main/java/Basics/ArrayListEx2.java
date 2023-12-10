/**
 * 1. 작성자 : Dani
 * 2. 작성일 : 12월 10일
 * 3. ArrayList의 요소 추가 및 삭제해보기
 */
package Basics;

import java.util.ArrayList;
import java.util.Vector;

public class ArrayListEx2 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("이름1");
        list.add("이름2");
        list.add("이름3");
        list.add("이름4");
        System.out.println("요소의 개수 : " + list.size()); // 요소의 갯수 : 4

        list.set(1, "추가1"); // 인덱스위치, 추가할 값
        System.out.println("인덱스 위치 : " + list.indexOf("추가1")); // 인덱스 위치 찾기


        /**
         * 순차적으로 삭제할 경우
         * 삭제 후 새로운 배열이 계속 만들어지기 때문에 정상적으로 삭제 되지 않는다.
         */

        /**
        for(int i=0; i< list.size(); i++){
            list.remove(i);
        }
        System.out.println("요소의 개수 : " + list.size()); // 2
         */

        /**
         * 뒤에서부터 삭제
         */
        for(int i =list.size()-1; i>=0; i--){
            list.remove(i);
        }

        System.out.println("요소의 개수 : " + list.size());
    }
}
