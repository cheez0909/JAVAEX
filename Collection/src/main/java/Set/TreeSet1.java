package Set;


import java.util.Set;
import java.util.TreeSet;

public class TreeSet1 {
    public static void main(String[] args) {
        TreeSet set = new TreeSet();

        int[] score = {80, 95, 50, 35, 45, 65, 10, 100};

        for(int i=0; i<score.length; i++){
            set.add(Integer.valueOf(score[i]));
        }
        // .headSet -> 지정된 객체보다 작은 값 반환
        System.out.println("50보다 작은 값 : " + set.headSet(Integer.valueOf(50)));
        // .tailSet -> 지정된 객체보다 큰 값 반환
        System.out.println("50보다 큰 값 : " + set.tailSet(Integer.valueOf(50)));
    }
}

