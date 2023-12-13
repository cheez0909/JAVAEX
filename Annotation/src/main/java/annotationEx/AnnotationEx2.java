/**
 * 1. 작성자 : Dani
 * 2. 작성일 : 12월 13일
 * 3. 애너테이션 @FunctionalInterface 예제 - 대체되었으니 사용을 권하지 않음
 */
package annotationEx;

import java.util.Arrays;

public class AnnotationEx2 {
    public static void main(String[] args) {
        Calculator cal = (i) -> Arrays.stream(i).sum();
        System.out.println(cal.add(4,5,6,7,8,9,10));
    }
}
