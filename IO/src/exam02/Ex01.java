package exam02;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex01 {
    public static void main(String[] args) {
        long stime = System.currentTimeMillis(); // 1970.1.1
        try(FileInputStream fis = new FileInputStream("2. 서블릿과 JSP.zip");
            FileOutputStream fos = new FileOutputStream("copied.zip")){

            while (fis.available()>0){
                fos.write(fis.read());
            }

        } catch (IOException e){
            e.printStackTrace();
        }
        long etime = System.currentTimeMillis();
        System.out.println("걸린 시간 : " + (etime-stime));
    }
}
