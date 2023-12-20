package streamClass;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamMain11 {
    public static void main(String[] args) {
        // 저자가 0, 1, 2만 나오도록한 후 그룹화를 해보자!
        List<Book> books = IntStream.rangeClosed(1, 10)
                .mapToObj(i->new Book("책" + i, "저자" +i, "출판사"+(i%3)))
                .toList();

        // books.forEach(System.out::println);
        Map<String, List<Book>> collect = books.stream().collect(Collectors.groupingBy(Book::getAuthor));
        // 그룹으로 나눠서 가져오고 싶을 때 사용
        List<Book> books1 = collect.get("출판사1");
        books1.forEach(System.out::println);
    }
}
