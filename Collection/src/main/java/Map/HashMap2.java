package Map;

import java.util.*;

public class HashMap2 {
    public static void main(String[] args) {
        HashMap map = new HashMap();
        map.put("이병헌", Integer.valueOf(80));
        map.put("김태리", Integer.valueOf(100));
        map.put("유연석", Integer.valueOf(10));

        Set set = map.entrySet(); // Map.Entry타입의 객체로 저장한 Set으로 반환

        // Iterator : 컬렌션에 저장된 요소를 접근하는데 사용하는 인터페이스
        // 컬렉션클래스에 .iterator()를 호출하여 반복문을 통해 클래스의 요소를 읽어온다.
        Iterator iterator = set.iterator();

        System.out.println(set); // 키=값

        // hasNext() -> 읽어 올 요소가 남아 있는지
        while (iterator.hasNext()){

            // next() -> 다음 요소를 읽어온다
            Map.Entry e = (Map.Entry) iterator.next();
            System.out.println("이름 : " + e.getKey() + " 점수 : " + e.getValue());
        }

        set = map.keySet(); // 맵의 key값만 가져옴
        System.out.println("참가자 명단 : " + set);

        Collection values = map.values(); // 맵의 value만 가져옴
        Iterator iterator1 = values.iterator();
        int total = 0;
        while (iterator1.hasNext()){
            Integer i = (Integer) iterator1.next();
            total += i.intValue();
        }
        System.out.println("총점 : " + total);
        System.out.println("평균 : " + (float) total / set.size());
        System.out.println("최고 점수 : " + Collections.max(values));
        System.out.println("최저 점수 : " + Collections.min(values));
    }
}
