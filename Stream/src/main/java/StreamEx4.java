/**
 * 1. 작성자 : Dani
 * 2. 작성일 : 12월 11일
 * 3. Stream 만들기 예제5
 */
import java.io.File;
import java.util.stream.Stream;

public class StreamEx4 {
    public static void main(String[] args) {
        Stream<File> stream = Stream.of(new File("Ex1.java"), new File("Ex2.java"),
                new File("Ex2"), new File("Ex3.java"));
//        stream.map(x -> x.getName()).forEach(System.out::println);

        // .peek() 는 .foreach()와 유사하지만 중간연산자 이다
        stream.map(File::getName).filter(x-> x.indexOf(".java") != -1).peek(System.out::println).forEach(System.out::println);


    }
}
