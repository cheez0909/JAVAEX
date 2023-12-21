package inputstream;

import java.io.FileInputStream;
import java.io.IOException;

public class InputStreamEx01 {
    public static void main(String[] args) {
        try(FileInputStream fis = new FileInputStream("test1.txt")){
//            int read = fis.read();
//            System.out.println(read); // 65 아스키코드가 읽힌다.

            // read()는 바이트 단위로 읽어옴
            char ch = (char) fis.read(); // 1바이트 읽기 A
            System.out.println(ch);

            ch = (char)fis.read(); // 1바이트 읽기 B
            System.out.println(ch);

            ch = (char)fis.read(); // 1바이트 읽기 C
            System.out.println(ch);

            ch = (char)fis.read(); // 1바이트 읽기 D
            System.out.println(ch);

            // 1바이트 읽기 ?? 문자열 끝
            // ch = (char)fis.read();
            // System.out.println(ch);

            // 문자를 다 읽어오면 -1이 출력된다.
            int read = fis.read();
            System.out.println(read); // -1

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
