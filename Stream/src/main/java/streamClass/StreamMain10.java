package streamClass;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static java.util.stream.Collectors.toMap;

public class StreamMain10 {
    public static void main(String[] args) {
        List<String> fruits = Arrays.asList("Apple", "Orange", "Mango", "Melon");
        String collect = fruits.stream().collect(Collectors.joining(","));
        System.out.println(collect);
    }
}
