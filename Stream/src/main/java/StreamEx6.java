/**
 * 1. 작성자 : Dani
 * 2. 작성일 : 12월 11일
 * 3. Stream 만들기 예제7
 */
import java.util.IntSummaryStatistics;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamEx6 {
    public static void main(String[] args) {
        Student[] students = {
                new Student("이름1", 1, 300),
                new Student("이름2", 2, 400),
                new Student("이름3", 3, 500),
                new Student("이름4", 3, 600),
                new Student("이름5", 3, 200),
                new Student("이름6", 2, 100),
                new Student("이름1", 1, 50),
        };


        /**
         * 점수 합 구하기
         */
        IntStream stream = Stream.of(students).mapToInt(Student::getTotalScore);
        int sum = stream.sum();
        System.out.println(sum);

        /**
         * 평균값 구하기
         */
        IntStream stream1 = Stream.of(students).mapToInt(Student::getTotalScore);
        double asDouble = stream1.average().getAsDouble();
        System.out.println(asDouble);


        /**
         * 통계 정보를 담고 있는 클래스 IntSummaryStatistics
         */
        IntStream stream2 = Stream.of(students).mapToInt(Student::getTotalScore);
        IntSummaryStatistics intSummaryStatistics = stream2.summaryStatistics();
        System.out.println(intSummaryStatistics);


    }
}
