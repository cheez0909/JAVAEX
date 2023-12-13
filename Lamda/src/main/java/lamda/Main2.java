package lamda;

import java.util.Arrays;
import java.util.function.*;

public class Main2 {
    public static void main(String[] args) {
       /*
       두 수 더하기
        */
        // 언박싱의 문제
//        BiFunction<Integer, Integer, Integer> add = (x, y)-> x+y;
//        int apply = add.apply(4, 6);
//        System.out.println(apply);
        IntBinaryOperator add = (x,y)->x+y;
        int i = add.applyAsInt(4, 5);
        System.out.println(i);

//        BinaryOperator<Integer> mul = (a,b)->a*b;
//        Integer apply1 = mul.apply(4, 5);
//        System.out.println(apply1);


        IntBinaryOperator mul = (a,b)->a*b;
        int apply1 = mul.applyAsInt(7, 4);
        System.out.println(apply1);

        int[] ints ={10, 20, 30, 40};
        Arrays.setAll(ints, x->x*x);
        System.out.println(Arrays.toString(ints));
    }
}
