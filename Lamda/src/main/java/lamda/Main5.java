package lamda;

import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Function;

public class Main5 {
    public static void main(String[] args) {
//        Consumer<String> func1 = s -> System.out.println(s.length());
        Consumer<String> func1 = System.out::println;
        Function<String, Integer> func2 = String::length;
        func1.accept("하이하이하이");
        System.out.println(func2.apply("dddddd"));

        /**
         * 문자열 2개 받고 반환값 boolean
         * 순서가 동일할 경우만 사용 가능
         */
        BiPredicate<String, String> func3 = String::equals;
        System.out.println(func3.test("22", "gg"));
    }
}
