package Optional;

import java.util.OptionalInt;
import java.util.stream.IntStream;

public class OptionalEx2 {
    public static void main(String[] args) {
        OptionalInt it = IntStream.rangeClosed(1, 100).reduce((x, y)->x+y);
        System.out.println(it.getAsInt());

    }
}
