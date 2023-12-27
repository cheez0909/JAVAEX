package exam04;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.HashMap;
import java.util.Map;

public class Ex01 {
    public static void main(String[] args) {
        Map<String, Object> data = new HashMap<>();

        try(FileOutputStream fos = new FileOutputStream("book.obj");
            ObjectOutputStream oos = new ObjectOutputStream(fos)){
            // 복구에 필요한 데이터만 저장되고 투입됨
            // 직렬화 객체에 저장된 데이터를 연속적인 데이터로 변화하는것
            // 메서드는 필요없고 인스턴스 변수만 저장함 인스턴스 변수가 복구할때 필요한 데이터임
            // 처음 쓸 때 데이터랑 나중에 복구되는 데이터는 다른 인스턴스
            Book b1 = new Book("책", "저자", "출판사");
            Book b2 = new Book("책2", "저자2", "출판사2");

            data.put("book1", b1);
            data.put("book2", b2);
            data.put("str", "안녕하세요");

            oos.writeObject(data);

            /*
            oos.writeObject(b1);
            oos.writeObject(b2);
            oos.writeObject("안녕하세요");
            */

        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
