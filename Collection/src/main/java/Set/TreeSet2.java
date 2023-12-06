package Set;


import java.util.TreeSet;

public class TreeSet2 {
    public static void main(String[] args) {
        TreeSet set = new TreeSet();

        String from = "b";
        String to = "d";

        set.add("abc");
        set.add("BAT");
        set.add("car");
        set.add("Car");
        set.add("dance");
        set.add("dZZZ");
        set.add("fan");

        System.out.println(set);

        System.out.println("range search : from " + from + " to " + to);
        // .subSet -> 범위검색(fromElement와 toElement사이)의 결과를 반환
        // (끝 범위인 toElement는 범위에 포함되지 않음)
        System.out.println("result1 : " + set.subSet(from, to));
        System.out.println("result2 : " + set.subSet(from, to + "zzz"));
    }
}

