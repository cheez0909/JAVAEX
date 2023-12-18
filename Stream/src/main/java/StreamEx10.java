/**
 * 1. 작성자 : Dani
 * 2. 작성일 : 12월 11일
 * 3. Stream 만들기 예제8
 */
import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;
import java.util.stream.IntStream;

public class StreamEx10 {
    public static void main(String[] args) {
        Random random = new Random();
        random.ints().limit(10).forEach(System.out::println);

        int[] array = IntStream.iterate(10, x -> x + 2).limit(5).toArray();
        System.out.println(Arrays.toString(array));

        int[] array1 = IntStream.generate(() -> 1).limit(10).toArray();
        System.out.println(Arrays.toString(array1));

    }
}
