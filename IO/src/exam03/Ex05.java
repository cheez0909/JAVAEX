package exam03;

import java.io.*;

public class Ex05 {
    public static void main(String[] args) {
        try(FileInputStream fis = new FileInputStream("data.dat");
            DataInputStream dis = new DataInputStream(fis)){

            boolean b = dis.readBoolean();
            int i = dis.readInt();
            String s = dis.readUTF();

            System.out.printf("result=%s, num=%d, str=%s\n", b, i, s);
            // 순서가 정확해야함
            // 자료형을 1개만 사용하는 것을 권장함
            // 수치가 동일한 것....

        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
