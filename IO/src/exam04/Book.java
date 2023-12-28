package exam04;

import java.io.Serializable;

// 직렬화 -> 마커 인터페이스
public class Book implements Serializable {

    public static final long serialVersionUID = 1L;
    private String title;
    private String author;
    private String publisher;

    private String str;
    private String str1;
    private String str3;
    /**
     * 생성자 추가
     */
    public Book(String title, String author, String publisher) {
        this.title = title;
        this.author = author;
        this.publisher = publisher;
    }

    /**
     * toString() 재정의
     */
    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", publisher='" + publisher + '\'' +
                '}';
    }
}
