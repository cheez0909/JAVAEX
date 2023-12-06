package Map;

import java.util.TreeMap;

public class TreeMap1 {
    public static void main(String[] args) {
        String[] data = {"I", "P", "A", "D", "I", "P", "A", "D"};

        TreeMap map = new TreeMap();

        for(int i=0; i<data.length; i++){
            if(map.containsKey(data[i])){
                // 인티저 타입으로 변환
                // .get()은 반환타입이 Object임
                Integer integer = (Integer) map.get(data[i]);
            }
        }
    }
}
