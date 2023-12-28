package exam05;

import java.io.File;
import java.io.IOException;

public class ex01 {
    public static void main(String[] args) throws IOException, InterruptedException {
        /**
         * 파일 만들기
         */
        /*
        File file = new File("D:/test.txt");
        file.createNewFile();
         */

        // 없는 경로에 파일 만들기
        // -> Exception in thread "main" java.io.IOException: 지정된 경로를 찾을 수 없습니다
        /*
        File file = new File("D:/folder/test.txt");
        file.createNewFile();
        */

        /*

        File dir = new File("D:/folder");
        if(!dir.exists()){
            // 파일 또는 디렉토리 존재 유무
            dir.mkdir(); // 디렉토리 만들기
        }
        file.createNewFile();
         */

        File dir = new File("D:/folder/folder1/folder2");
        if(!dir.exists()){
            dir.mkdirs(); // 중첩된 디렉토리 만들기
        }
        File file = new File(dir, "test1.txt");

        /**
         * 임시파일 만들때
         */
        File file2 = File.createTempFile("tmp_", ".log", new File("D:/"));
        Thread.sleep(5000);
        file2.deleteOnExit();
    }

}
