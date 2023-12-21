package inputstream;

import java.io.FileInputStream;
import java.io.IOException;

public class InputStreamEx02 {
    public static void main(String[] args) {
        try(FileInputStream fis = new FileInputStream("test1.txt")){
            /**
             * 반복문을 사용하여 출력
             */
            int ch=0;
            while((ch=fis.read())!=-1){
                System.out.print((char)ch);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
