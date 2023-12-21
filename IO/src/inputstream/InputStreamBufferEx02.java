package inputstream;

import java.io.FileInputStream;
import java.io.IOException;

public class InputStreamBufferEx02 {
    public static void main(String[] args) {
        byte[] buffer = new byte[5]; // 5바이트의 배열생성
        try(FileInputStream fis = new FileInputStream("test2.txt")) {
          while (fis.available()>0) {
              int ch = fis.read(buffer); // 읽어온 데이터를 버퍼에 담아서 출력
              for(int i= 0; i<buffer.length; i++){
                  System.out.print((char)buffer[i]);
              }
              System.out.println();
              // 마지막 버퍼에 데이터가 겹쳐져 있다
              // 데이터를 덮어 씌우기 때문에...
          }
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
