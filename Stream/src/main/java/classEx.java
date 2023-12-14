import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class classEx {
    public static void main(String[] args) {
        List<String> str = new ArrayList<>();
        str.add("안녕");
        str.add("안녕");
        str.add("안녕");
        str.add("1234");
        str.add("안5녕");
        str.add("안ㄴㅁ녕");
        str.add("안111녕");
        str.add("안111녕");
        str.add("145435");
        str.stream().distinct().filter(x -> x.length() >= 5).forEach(System.out::println);
        int sum = IntStream.rangeClosed(1, 100).sum();
        System.out.println(sum);

    }
}
