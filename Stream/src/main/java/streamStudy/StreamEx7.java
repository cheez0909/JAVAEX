package streamStudy; /**
 * 1. 작성자 : Dani
 * 2. 작성일 : 12월 11일
 * 3. Stream 만들기 예제8
 */
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class StreamEx7 {
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
        List<Student> studentList = Stream.of(students).collect(toList());
        System.out.println(studentList);

        String[] fruits = {"사과", "배", "오렌지", "귤"};
        String str = Stream.of(fruits).collect(Collectors.joining(",","<<",">>"));
        System.out.println(str);
        System.out.println();
    }
}
