package lamda;

import java.util.function.Function;
import java.util.function.IntPredicate;

public class Main4 {
    public static void main(String[] args) {
        /**
         * 문자열이 들어오면 문자열의 길이를 반환해주는 함수
         */
        Function<String, Integer> func1 = s -> s.length();

        /**
         * 숫자가 들어오면 세제곱 리턴 해주는 함수
         */
        Function<Integer, Integer> func2 = x -> x*x*x;

        /**
         * 문자열이 들어오면 길이를 반환하고
         * 길이를 세제곱한다.
         */
        Function<String, Integer> stringIntegerFunction = func1.andThen(func2);
        Integer apply = stringIntegerFunction.apply("안녕안녕안녕");
//        System.out.println(apply);

        Function<Integer, Integer> func3 = x -> x;
        Function<Integer, Integer> identity = Function.identity();
        // 자기 자신을 반환
        System.out.println(identity);


        IntPredicate cond1 = x -> x>=10;
        IntPredicate cond2 = x -> x<=100;

        IntPredicate and = cond1.and(cond2); // 10 <= x <= 100
        IntPredicate negate = cond2.negate(); // x>100

        System.out.println("and  : "  + and.test(50));
        System.out.println("negate : " + negate.test(50));
    }
}
