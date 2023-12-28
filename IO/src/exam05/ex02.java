package exam05;

import java.io.File;
import java.io.IOException;
import java.util.function.IntUnaryOperator;
import java.util.function.UnaryOperator;

public class ex02 {
    public static void main(String[] args) throws IOException, InterruptedException {
        UnaryOperator<Integer> fun = a -> a*a;
        Integer apply = fun.apply(5);
        System.out.println(apply);

        IntUnaryOperator funx = a -> a*a;
        int i = funx.applyAsInt(5);
        System.out.println(i);
    }
}
