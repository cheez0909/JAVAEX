package exam04;

import java.io.*;
import java.util.Map;
import java.util.stream.IntStream;

public class Ex02 {
    public static void main(String[] args) {
        try(FileInputStream fis = new FileInputStream("book.obj");
            ObjectInputStream ois = new ObjectInputStream(fis)){

            /**
             * 여러개를 가져올 경우 순서대로 가져와야함
             */
            /*
            Book b1 = (Book) ois.readObject();
            System.out.println(b1);

            Book b2 = (Book) ois.readObject();
            System.out.println(b2);

            String str = (String) ois.readObject();
            System.out.println(str);
             */
            /**
             * 직접 순서대로 불러오기보다는 필요할 때만 불러오고 싶을 때 맵으로 저장해서 불러올 수 있다.
             */
            Map<String, Object> data = (Map<String, Object>) ois.readObject();
            String str = (String) data.get("str");
            Book book1 = (Book) data.get("book1");
            Book book2 = (Book) data.get("book2");

            System.out.println(str);
            System.out.println(book1);
            System.out.println(book2);

        } catch (IOException | ClassNotFoundException e ){
            // 존재하지 않거나 다른 클래스 일 수 있음
            e.printStackTrace();
        }
    }
}
