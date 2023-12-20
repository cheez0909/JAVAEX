package streamClass;

import java.util.Arrays;
import java.util.OptionalInt;

public class StreamMain6 {
    public static void main(String[] args) {
        /**
         * 1에서 10까지의 합
         */
        int[] nums = {4, 5, 10, 55, 71, 2, 51};

        // 최대값 구하기
        int max = Arrays.stream(nums).reduce(Integer.MIN_VALUE, (a, b) -> a > b ? a : b);
        System.out.println(max);

        // 최소값 구하기
        int min = Arrays.stream(nums).reduce(Integer.MAX_VALUE, (a,b)-> a<b?a:b);
        System.out.println(min);


    }
}
