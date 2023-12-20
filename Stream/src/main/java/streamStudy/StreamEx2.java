package streamStudy; /**
 * 1. 작성자 : Dani
 * 2. 작성일 : 12월 11일
 * 3. Stream 만들기 예제2
 */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamEx2 {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("이름3");
        names.add("이름1");
        names.add("이름8");
        names.add("이름4");
        names.add("이름5");

        Stream<String> stream = names.stream();
        stream.forEach(System.out::println);

        System.out.println("======");
        int[] nums = {1, 44, 9, 10, 456, 777, 5, 6};
        Arrays.stream(nums).sorted().limit(4).forEach(System.out::println);

        /**
         * Integer 타입의 배열이지만 결과값이 int로 반환됨
         * = > 언박싱!!!
         * reduce ->  데이터의 합
         */
        System.out.println("======");
        Integer[] nums1 = {1, 44, 9, 10, 456, 777, 5, 6};
        int reduce = Arrays.stream(nums1).reduce(0, (x, y) -> x + y);
        System.out.println(reduce);

        /**
         * 기본자료형을 이용하여 언박싱이 일어나지 않음
         */
        System.out.println("======");
        int[] nums2 = {1, 44, 9, 10, 456, 777, 5, 6};
        IntStream stream1 = Arrays.stream(nums2);
        int reduce2 = stream1.reduce(0, (x, y) -> x + y);
        System.out.println(reduce2);

    }
}
