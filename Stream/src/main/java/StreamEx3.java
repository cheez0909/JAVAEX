/**
 * 1. 작성자 : Dani
 * 2. 작성일 : 12월 11일
 * 3. Stream 만들기 예제3
 *  - 여러 스트림 ㅁ나들기
 */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamEx3 {
    public static void main(String[] args) {
        /**
         * 배열의 스트림 만들기
         */
        System.out.println("=========");
        int[] nums2 = {1, 44, 9, 10, 456, 777, 5, 6};
//        IntStream stream = Arrays.stream(nums2);
//        IntStream stream = IntStream.of(nums2);
        IntStream stream = IntStream.of(1, 44, 9, 10, 456, 777, 5, 6);
        int reduce2 = stream.reduce(0, (x, y) -> x + y);
        System.out.println(reduce2);

        /**
         * 임의의 수 스트림 만들기
         */
        System.out.println("=========");
        Random random = new Random();
        IntStream stream1 = random.ints();
        stream1.limit(5).forEach(System.out::println);

        /**
         * 람다식
         * iterate() ->
         *     iterate()는 이전 요소를 seed로 해서 다음 요소를 계산한다.
         *     반복해서 계산
         */
        int[] nums = IntStream.iterate(3, x->x*2).limit(5).toArray();
        System.out.println(Arrays.toString(nums));

        /**
         * 람다식
         * generate() ->
         *     generate()는 seed가 없음
         */
        int[] nums1 = IntStream.generate(() -> (int)(Math.random() * 10)).limit(5).toArray();
        System.out.println(Arrays.toString(nums1));

        /**
         * 두 스트림의 연결
         * .concat()
         */
        String[] animal = {"사자", "토끼", "호랑이"};
        Stream<String> animal1 = Stream.of(animal);
        String[] animal2 = {"사자", "토끼", "호랑이"};
        Stream<String> animal3 = Stream.of(animal2);
        String[] array = Stream.concat(animal1, animal3).toArray(String[]::new);
        System.out.println(Arrays.toString(array));

        /**
         * 제한 조건
         * -> filter()
         */
        int[] numbers = {1, 954, 744, 45, 2, 12, 4, 100, 1220, 14, 450};
        Arrays.stream(numbers).filter(x -> x>500).forEach(System.out::println);

    }
}
