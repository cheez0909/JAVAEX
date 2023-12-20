package streamStudy; /**
 * 1. 작성자 : Dani
 * 2. 작성일 : 12월 11일
 * 3. Stream 만들기 예제8
 */
import java.util.Arrays;
import java.util.Comparator;
import java.util.IntSummaryStatistics;
import java.util.List;

public class StreamEx9 {
    public static void main(String[] args) {
        int[] nums = {11, 5, 3, 22, 15, 75};

        // IntStream -> .boxex() -> Stream<Integer>
        int[] array = Arrays.stream(nums).boxed().sorted(Comparator.reverseOrder()).mapToInt(x -> x).toArray();
        System.out.println(Arrays.toString(array));
    }
}
