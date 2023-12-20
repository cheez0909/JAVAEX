package streamClass;

import java.util.Arrays;

public class StreamMain5 {
    public static void main(String[] args) {
        /**
         * 1에서 10까지의 합
         */
        int[] nums = {1, 3, 5, 7, 9, 11, 13, 15, 17, 19};

        /**
         * 0이 처음에 acc에 들어감
         * el은 nums의 배열을 하나씩 불러옴
         * acc에 nums의 합을 불러온다.
         */
        int total = Arrays.stream(nums).reduce(0, (acc, el)-> {
            System.out.printf("acc=%d, el=%d\n", acc, el);
            acc += el;
            return acc;
        });
    }
}
