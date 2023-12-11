import java.util.Comparator;
import java.util.stream.Collectors;
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
//        Stream.of(students).sorted(Comparator.comparing(Student::getBan).thenComparing(Student::getTotalScore))
//                .forEach(System.out::println);


        /**
         * Comparator.naturalOrder() 활용
         */
        Stream.of(students).sorted(Comparator.comparing(Student::getBan).thenComparing(Comparator.naturalOrder()))
                .forEach(System.out::println);

    }
}
