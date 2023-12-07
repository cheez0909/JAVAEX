package Map;

import java.util.Enumeration;
import java.util.Properties;

public class Properties1 {
    public static void main(String[] args) {
        Properties prop = new Properties();

        // prop에 키와 값을 저장한다.
        prop.setProperty("time", "시간");
        prop.setProperty("apple", "사과");
        prop.setProperty("banana", "바나나");

        // key값을 불러옴
        Enumeration enumeration = prop.propertyNames();

        while (enumeration.hasMoreElements()){
            String s = (String) enumeration.nextElement();
            System.out.println(s + "=" + prop.getProperty(s));
        }
        // apple=사과
        // banana=바나나
        // time=시간

        System.out.println();

        prop.setProperty("time", "시각"); // 값을 변경한다
        System.out.println(prop); // prop 출력
        // {banana=바나나, apple=사과, time=시각}

        prop.list(System.out);// prop에 저장된 요소들을 화면(System.out)에 출력한다.
        // -- listing properties --
        // banana=바나나
        // apple=사과
        // time=시각

    }
}
