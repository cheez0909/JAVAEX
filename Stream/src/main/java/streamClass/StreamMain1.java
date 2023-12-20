package streamClass;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamMain1 {
    public static void main(String[] args) {
        IntStream intStream = IntStream.range(1,5); // 1이상 5미만
        intStream.forEach(System.out::println);

        System.out.println("======");
        IntStream intStream2 = IntStream.rangeClosed(1,5).map(x -> x+1); // 1이상 5이하, 1씩 더해라
        intStream2.forEach(System.out::println);

        System.out.println("======");
        Stream<Integer> iterate = Stream.iterate(2, x -> x * 2); // 이전 값을 이용하여 다음 요소 계산, 무한스트림
        iterate.limit(5).forEach(System.out::println);
        System.out.println("======");
        Stream<Integer> generate = Stream.generate(() -> 1); // 이전요소 없이 다음 요소 계산
        generate.limit(5).forEach(System.out::println);

        System.out.println("======");
        String[] str = {"123", "456"};
        String[] str1 = {"AB", "DET"};
        Stream<String> str2 = Stream.of(str);
        Stream<String> str3 = Stream.of(str1);
        Stream<String> concat = Stream.concat(str2, str3);

        System.out.println("======");
        IntStream intStream1 = IntStream.rangeClosed(1, 10);
        intStream1.skip(4).limit(2).forEach(System.out::println);

        System.out.println("======");
        IntStream intStream5 = IntStream.of(1, 2, 2, 3, 3, 4, 5, 5, 6);
        intStream5.distinct().forEach(System.out::println);
        IntStream intStream6 = IntStream.range(1, 10);
        intStream6.filter(x->x>5).forEach(System.out::println);

        System.out.println("======");
        List<Member> members = new ArrayList<>();
        members.add(new Member("홍길동", 20));
        members.add(new Member("유관순", 40));
        members.add(new Member("이순신", 60));
        Integer[] collect = members.stream().map(x -> x.getAge()).toArray(Integer[]::new);
        Arrays.stream(collect).forEach(System.out::println);

        System.out.println("======");
        Stream<String> strStrm = Stream.of("abc", "def", "jklmn");
        Stream<String> strStrm2 = Stream.of("ABC", "GHI", "JKLMN");

        Stream<Stream<String>> strmStrm = Stream.of(strStrm, strStrm2);
        Stream<String> strStream = strmStrm.map(s -> s.toArray(String[]::new)) // Stream<Stream<String>> -> Stream<String[]>
                .flatMap(Arrays::stream); // Stream<String[]> -> Stream<String>

        System.out.println("======");
        IntStream intStream3 = IntStream.range(1, 10);
        int reduce = intStream3.reduce(0, (a, b) -> a + 1);
        System.out.println(reduce);
    }
        static class Member{
        private String name;
        private int age;

            public Member(String name, int age) {
                this.name = name;
                this.age = age;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public int getAge() {
                return age;
            }

            public void setAge(int age) {
                this.age = age;
            }
        }
}
