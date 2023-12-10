/**
 * 1. 작성자 : Dani
 * 2. 작성일 : 12월 10일
 * 3. Arrays클래스의 기본 문법
 */
package Basics;

import java.util.Arrays;
import java.util.List;
import java.util.function.IntUnaryOperator;

import static java.util.Arrays.*;

public class ArraysEx1 {
    public static void main(String[] args) {
        int[] arr = {0,1,2,3,4};
        int[] arr2 = Arrays.copyOf(arr, arr.length);
        System.out.println(Arrays.toString(arr2));
        int[] arr3 = Arrays.copyOf(arr, 3); // 인덱스 <3 까지 복사
        System.out.println(Arrays.toString(arr3));
        int[] arr4 = Arrays.copyOfRange(arr, 2, 4);
        System.out.println(Arrays.toString(arr4)); // 인덱스 2이상 4미만


        /**
         * fill() : 배열의 모든 요소를 지정된 값으로 채운다.
         */
        int[] fill = new int[5];
        Arrays.fill(fill, 0);
        System.out.println(Arrays.toString(fill));


        /**
         * 제곱하여 저장
         */
        IntUnaryOperator generator = new IntUnaryOperator() {
            @Override
            public int applyAsInt(int operand) {
                return operand * operand;
            }
        };

        /**
         * setAll() : 배열을 채우는데 사용할 함수형 인터페이스를 매개변수로 받는다.
         */
        setAll(arr, generator);
        System.out.println(Arrays.toString(arr));

        /**
         * sort() : 배열의 정렬
         */
        String[] strings = {"z", "A1", "HG", "S", "d", "n", "b"};
        sort(strings);
        System.out.println(Arrays.toString(strings)); // 오름차순

        /**
         * asList() : 배열을 List로 변환
         */
        String[] strings2 = {"z", "A1", "HG", "S", "d", "n", "b"};
        List<String> list = asList(strings2);
        System.out.println(list.stream().toList());

    }
}
