package exer;

import java.util.Comparator;
import java.util.Objects;


public class Book implements Comparable<Book> {
    private String title;
    private String publisher;
    private String author;
    public Book(){}
    public Book(String title, String publisher, String author) {
        this.title = title;
        this.publisher = publisher;
        this.author = author;
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, author, publisher);
    }

//    @Override
//    public boolean equals(Object obj) {
//
//    }


    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", publisher='" + publisher + '\'' +
                ", author='" + author + '\'' +
                '}';
    }


    @Override
    public int compareTo(Book o) {
        return o.title.compareTo(this.title);
    }

}
