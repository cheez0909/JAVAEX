package lamda;

import java.util.function.*;

public class Main1 {
    public static void main(String[] args) {
        // Function<Integer, Integer> func = x -> x*2;
        UnaryOperator<Integer> func = x->x*x;
        Integer apply = func.apply(100);
        System.out.println(apply);

        Consumer<String> con = x -> System.out.println(x);
        con.accept("안녕하세요");

        int x = 30;
        Supplier<Integer> sup = () -> x;
        System.out.println(sup.get());

        Predicate<Integer> pre = i -> i>40;
        System.out.println(pre.test(50));
    }
}
