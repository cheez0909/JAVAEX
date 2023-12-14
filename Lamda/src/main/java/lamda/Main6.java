package lamda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class Main6 {
    public static void main(String[] args) {
        Supplier<Book> book = Book::new;
        List<String> names = Arrays.asList("이름1", "이름2", "이름3");
        // 리스트를 배열로 변환
        String[] names2 = names.stream().toArray(String[]::new);
    }
}
