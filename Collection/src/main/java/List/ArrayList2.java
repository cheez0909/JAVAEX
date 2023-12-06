package List;

import java.util.ArrayList;
import java.util.List;

public class ArrayList2 {
    public static void main(String[] args) {


        final int LIMIT = 10;
        String source = "0123456789abcdefgDFEFDAFDJ!L@#%$%$ZZSDF";

        int length = source.length(); // 문자열의 길이

        // 크기를 여유롭게 설정함
        // 생설할 때 지정한 크기보다 더 많은 객체를 저장하면 자동적으로
        // 크기가 늘어나기는 하지만 이 과정에서 처리시간이 많이 소요되기 때문이다.
        List list = new ArrayList(length / LIMIT + 10);


        // LIMIT 크기만큼 잘라서 리스트에 저장
        for (int i=0; i<length; i+=LIMIT){
            if(i+LIMIT<length){
                list.add(source.substring(i, i+LIMIT));
            }else{
                list.add(source.substring(i));
            }
        }

        for (int i=0; i<list.size(); i++){
            System.out.println(list.get(i));
        }
        //
    }
}
