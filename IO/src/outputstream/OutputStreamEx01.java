package outputstream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class OutputStreamEx01 {
    public static void main(String[] args) {
        try(FileOutputStream fos = new FileOutputStream("test2.txt")){
            for(char ch='A'; ch <='Z'; ch++){
                fos.write(ch);
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
