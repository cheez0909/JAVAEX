package streamClass;

import java.util.*;
import java.util.stream.Collectors;

public class StreamMain8 {
    public static void main(String[] args) {
        // 배열을 리스트로
        List<String> names = Arrays.asList("이름1", "이름2", "이름3", "이름4", "이름2");
        System.out.println(names);

        // 셋으로 변환하기 : 중복이 제거됨
        Set<String> names2 = names.stream().collect(Collectors.toSet());
        System.out.println(names2);

        // 리스트를 ArrayList로 변경하기
        ArrayList<String> names3 = names.stream()
                .collect(Collectors.toCollection(ArrayList::new));
        System.out.println(names3);
    }
}
