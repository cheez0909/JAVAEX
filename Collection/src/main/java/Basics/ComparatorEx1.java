package Basics;

import java.util.Comparator;
import java.util.TreeSet;

public class ComparatorEx1 {
    public static void main(String[] args) {
        Comparator<Integer> comp = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return (o1 - o2) * -1;
            }
        };

//        TreeSet<Integer> treeSet = new TreeSet<>(comp);
        TreeSet<Integer> treeSet = new TreeSet<>(Comparator.reverseOrder());
        treeSet.add(5);
        treeSet.add(4);
        treeSet.add(10);
        treeSet.stream().forEach(System.out::println);
    }
}
