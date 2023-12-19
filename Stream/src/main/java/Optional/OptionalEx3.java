package Optional;

import exer.Book;

import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.IntStream;

public class OptionalEx3 {
    public static void main(String[] args) {
        Optional<Book> book = Optional.ofNullable(null);
        /*
        Book b1 = new Book();
        Book b = book.orElse(b1);
        */
        Book b = book.orElseGet(Book::new);

    }
}
