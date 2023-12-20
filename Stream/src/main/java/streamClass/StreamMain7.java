package streamClass;

import java.util.Arrays;
import java.util.OptionalInt;

public class StreamMain7 {
    public static void main(String[] args) {
        /**
         * 1에서 10까지의 합
         */
        int[] nums = {4, 5, 10, 55, 71, 2, 51};

        // 최대값 구하기
        OptionalInt max = Arrays.stream(nums).reduce((a, b) -> a>b?a:b);
        System.out.println(max.getAsInt());

        // 최소값 구하기
        OptionalInt min = Arrays.stream(nums).reduce((a,b)-> a<b?a:b);
        System.out.println(min.getAsInt());
    }
}
