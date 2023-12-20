package streamClass;

import java.util.stream.IntStream;

public class StreamMain2 {
    public static void main(String[] args) {
        /**
         * 홀수만 구하기
         */
        IntStream intStream = IntStream.rangeClosed(1, 100);
        int sum = intStream.filter(x -> x % 2 == 1).sum();
        System.out.println(sum);


    }
}
