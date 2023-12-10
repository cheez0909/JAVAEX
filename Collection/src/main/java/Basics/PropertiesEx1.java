/**
 * 1. 작성자 : Dani
 * 2. 작성일 : 12월 10일
 * 3. Properties 기본 문법
 *  a.HashMap의 구버전인 Hashtable을 상속받아 구현한 것
 *  b.Properties는 (String, String)의 형태로 저장
 *  c.애플리케이션의 환경 설정과 관련된 속성(property)를
 *    저장하는데 사용되며 데이터를 파일로 부터 읽고 쓰는 편리한 기능을 제공
 */
package Basics;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class PropertiesEx1 {
    public static void main(String[] args) throws IOException {
        Properties prop = new Properties();
        prop.setProperty("key1", "value1");
        prop.setProperty("key2", "value2");
        prop.setProperty("key3", "value3");
        prop.list(System.out);

        // 파일을 생성함
        prop.store(new FileWriter("test.properties"), "(❁´◡`❁)");
        prop.storeToXML(new FileOutputStream("test.xml"), "(❁´◡`❁)");

        // 파일을 읽어옴
        prop.loadFromXML(new FileInputStream("test.xml"));
        prop.list(System.out);
    }
}
