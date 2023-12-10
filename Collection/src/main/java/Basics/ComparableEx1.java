/**
 * 1. 작성자 : Dani
 * 2. 작성일 : 12월 10일
 * 3. Comparator 재정의 : 기본 정렬기준 외에 다른 기준으로 정렬하고자할 때 사용
 */
package Basics;

import java.util.Arrays;
import java.util.Comparator;


/**
 * 내림차순으로 재정의 하기
 */
class DecendingOrder implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
        int c = o1.compareTo(o2);
        return c * -1;
    }
}
public class ComparableEx1 {
    public static void main(String[] args) {
        String[] alphas = {"D", "a", "B", "C", "z"};
        Arrays.sort(alphas, new DecendingOrder());
        System.out.println(Arrays.toString(alphas));


        /**
         * 익명함수 형태로 사용해보기
         */
        String[] alphas2 = {"D", "a", "B", "C", "z"};
        Comparator<String> decendingOrders = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        };

        Arrays.sort(alphas2, decendingOrders);
        System.out.println(Arrays.toString(alphas2));

        String[] alphas3 = {"D", "a", "B", "C", "z"};
        Arrays.sort(alphas3, Comparator.reverseOrder()); // 미리 정의되어있는 메서드가 있음
        System.out.println(Arrays.toString(alphas3));



    }
}
