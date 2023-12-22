package exam02;

import java.io.*;

public class Ex02 {
    public static void main(String[] args) {
        long stime = System.currentTimeMillis();
        try(FileInputStream fis = new FileInputStream("2. 서블릿과 JSP.zip");
            BufferedInputStream bis = new BufferedInputStream(fis);
            FileOutputStream fos = new FileOutputStream("buffered_copied.zip");
            BufferedOutputStream bos = new BufferedOutputStream(fos);){

            while(bis.available()>0){
                bos.write(bis.read());
            }


        } catch (IOException e){
            e.printStackTrace();
        }
        long etime = System.currentTimeMillis();
        System.out.println("걸린 시간 : " + (etime - stime));
    }
}
