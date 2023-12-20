package streamStudy; /**
 * 1. 작성자 : Dani
 * 2. 작성일 : 12월 11일
 * 3. Stream 만들기 예제1
 */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamEx1 {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("이름3");
        names.add("이름1");
        names.add("이름8");
        names.add("이름4");
        names.add("이름5");


        /**
         * Collections의 정렬기능
         */
        /*
        Collections.sort(names);
        System.out.println(names);
        */

        /**
         * 정렬 후 새로운 ArrayList로 만들기
         */
        ArrayList<String> collect = names.stream().sorted().collect(Collectors.toCollection(ArrayList::new));
        System.out.println(collect);

        /**
         * 정렬 후 새로운 String 배열로 만들기
         */
        String[] strings = {"이름1", "이름3","이름9","이름00","이름"};
        String[] array = Arrays.stream(strings).sorted().toArray(String[]::new);
        System.out.println(Arrays.toString(array));

        System.out.println("============================");

        int total = 0;
        for(int i=1; i<=100; i++){
            total += i;
        }
        System.out.println("1부터 100 까지의 합 : " + total);

        int total2 = IntStream.rangeClosed(1, 100).sum();
        System.out.println("1부터 100 까지의 합 : " + total2);
    }
}
