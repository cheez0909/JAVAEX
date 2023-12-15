import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.UnaryOperator;
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

        List<String> words1 = Arrays.asList("aa", "bb", "cc"); // 배열을 리스트로 만들어줌
//        words1.stream().map(x->x.toUpperCase()).forEach(System.out::println);
        List<String> map = map(words1, s -> s.toUpperCase()).stream().toList();
        System.out.println(map);

    }

    // UnaryOperator : 입력값과 출력값의 타입이 동일하다.
    // Function  : 입력값과 출력값의 타입이 다를 수 있음.
    public static List<String> map(List<String> words, UnaryOperator<String> oper){
        List<String> converted = new ArrayList<>();
        for(String word : words){
                String word2 = oper.apply(word);
                converted.add(word2);
        }
        return converted;
    }
}
