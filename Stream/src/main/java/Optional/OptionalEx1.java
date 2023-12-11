package Optional;

import java.util.Optional;

public class OptionalEx1 {
    public static void main(String[] args) {
        Optional<String> op1 = Optional.of("anc");
        String s = op1.get();
        System.out.println(s);

//        Optional<String> op2 = Optional.of(null);
        Optional<String> op3 = Optional.ofNullable(null);
//        String s1 = op3.get();
        System.out.println(op3.orElse("널입니당")); // 널 일경우 설정값
        String s1 = op3.orElseGet(() -> "B"); // 널 일경우 가져올 값
        System.out.println(s1);


    }
}
