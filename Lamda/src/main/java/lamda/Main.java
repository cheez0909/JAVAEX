package lamda;

import java.util.Arrays;
import java.util.Comparator;
import java.util.TreeSet;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        int[] nums = {1,2,7,5,6};

        // 단일 기능이고 사용자 정의 기능이기 때문에
        // 직접 매개변수로 투입할 수 있다.
        int[] cal = calc(nums, i -> i + i);
        System.out.println(Arrays.toString(cal));
        int[] array = Arrays.stream(nums).map(x -> x * x).filter(x -> x>=30).toArray();
        System.out.println(Arrays.toString(array));

        /*
        Calculator cal = i->i*i; // 단일 기능
        int[] calc = calc(nums, cal);
        System.out.println(Arrays.toString(calc));
         */

        Comparator<String> st = (x, y) -> x.compareTo(y);
        Comparator<String> st1 = String::compareTo;
        TreeSet<String> strings = new TreeSet<>(st);
        strings.add("안녕");
        strings.add("ㄱ");
        strings.stream().forEach(System.out::println);
    }
    public static int[] calc(int[] nums, Calculator cal){
        int[] num = new int[nums.length];
        for(int i=0; i<num.length; i++){
            num[i] = cal.square(nums[i]);
        }
        return num;
    }
}
