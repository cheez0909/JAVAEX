package streamStudy; /**
 * 1. 작성자 : Dani
 * 2. 작성일 : 12월 11일
 * 3. Stream 만들기 예제8
 */
import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class StreamEx8 {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        // 통계
        IntSummaryStatistics intSummaryStatistics = nums.stream().mapToInt(x -> x).summaryStatistics();
        long sum = intSummaryStatistics.getSum();
        double average = intSummaryStatistics.getAverage();
        long count = intSummaryStatistics.getCount();
        int max = intSummaryStatistics.getMax();
        int min = intSummaryStatistics.getMin();

        System.out.printf("sum = %d, avg=%.2f, count=%d, max=%d, min=%d", sum, average, count, max, min);
    }
}
