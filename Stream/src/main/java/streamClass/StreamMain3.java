package streamClass;

import java.util.Arrays;
import java.util.stream.IntStream;

public class StreamMain3 {
    public static void main(String[] args) {
        /**
         * 1, 3, 5.. 홀수 10개를
         */
        int[] nums = IntStream.iterate(1, x->x+2)
                .limit(10)
                .peek(System.out::println) // 중간 연산
                .map(x -> x*x).toArray();
        System.out.println(Arrays.toString(nums));



    }
}
