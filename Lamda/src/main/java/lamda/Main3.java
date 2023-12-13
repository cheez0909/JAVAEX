package lamda;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;

public class Main3 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("이름1", "이름2", "이름3", "이름4");
        list.forEach(System.out::println);

    }
}
