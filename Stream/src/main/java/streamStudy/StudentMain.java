package streamStudy; /**
 * 1. 작성자 : Dani
 * 2. 작성일 : 12월 11일
 * 3. Stream 만들기 예제4
 *  - streamStudy.Student 클래스 내부 정렬 재정의
 */
import java.util.Optional;
import java.util.stream.Stream;

public class StudentMain {
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


//        Stream.of(students).sorted().forEach(System.out::println);
        /**
         * Comparator.comparing() 활용
         */
//        Stream.of(students).sorted(Comparator.comparing(streamStudy.Student::getBan).thenComparing(streamStudy.Student::getTotalScore))
//                .forEach(System.out::println);


        /**
         * Comparator.naturalOrder() 활용
         */
//        Stream.of(students).sorted(Comparator.comparing(streamStudy.Student::getBan).thenComparing(Comparator.naturalOrder()))
//                .forEach(System.out::println);

        Optional<Student> any = Stream.of(students).filter(x -> x.getTotalScore() < 300).findAny();
        System.out.println(any);

    }
}
