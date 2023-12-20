package streamClass;

import java.util.Arrays;

public class StreamMain4 {
    public static void main(String[] args) {
        /**
         * 문자열의 길이가 3자리 이상인 것만 포함된 것
         */
        String[] strs = {"aa", "aaa", "bbb", "ccc"};
        /**
         * allMatch -> 전부 참
         * anyMatch -> 하나라도 참이면 참
         * noneMatch -> 전부 거짓이면 참
         */
        boolean b = Arrays.stream(strs).allMatch(x -> x.length() >= 3);
        System.out.println(b);

        boolean c = Arrays.stream(strs).anyMatch(x -> x.length() >= 3);
        System.out.println(c);

        boolean d = Arrays.stream(strs).noneMatch(x -> x.length() >= 3);
        System.out.println(d);
    }
}
