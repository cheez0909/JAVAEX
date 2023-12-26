package exam03;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex02 {
    public static void main(String[] args) throws IOException {
       //  char ch1 = (char) System.in.read(); // 아스키 코드, 한글깨짐
       //  System.out.println(ch1);
        System.out.println("아무거나 입력");
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr); // 문장입력 불가
        // 한글깨짐이 없음
        // 유니코드
        char ch = (char)isr.read();
        System.out.println(ch);

    }
}
