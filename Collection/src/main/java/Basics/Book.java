

package Basics;

public class Book implements Comparable<Book>{
    private  String name;
    private  int price;

    public Book(String name, int price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public int compareTo(Book book) {
        return this.name.hashCode() - book.name.hashCode(); // 이름 순
    }
}
