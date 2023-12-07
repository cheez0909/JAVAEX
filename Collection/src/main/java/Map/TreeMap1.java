package Map;


import java.util.*;

public class TreeMap1 {
    public static void main(String[] args) {
        String[] data = {"I", "P","P","P","P","P", "A", "D", "I", "P", "A", "D", "D", "A", "A", "A"};

        TreeMap map = new TreeMap();

        for(int i=0; i<data.length; i++){
            if(map.containsKey(data[i])){
                // 인티저 타입으로 변환
                // .get()은 반환타입이 Object임
                Integer integer = (Integer) map.get(data[i]);
                map.put(data[i], integer + Integer.valueOf(1));
            }else{
                map.put(data[i], Integer.valueOf(1));
            }
        }

        Iterator iterator = map.entrySet().iterator();
        System.out.println("== 기본 정렬 ==");
        while (iterator.hasNext()){
            Map.Entry e = (Map.Entry ) iterator.next();
            int i = ((Integer) e.getValue()).intValue();
            System.out.println(e.getKey() + " : " + printBar('#', i) + " " + i);
        }
        System.out.println();


        Set set = map.entrySet();
        List list = new ArrayList(set);

        Collections.sort(list, new ValueComparator());

        iterator = list.iterator();
        System.out.println("==값의 크기가 큰 순서로 정렬 ==");

        while (iterator.hasNext()){
            Map.Entry e = (Map.Entry ) iterator.next();
            int i = ((Integer) e.getValue()).intValue();
            System.out.println(e.getKey() + " : " + printBar('#', i) + " " + i);

        }

    }

    static class ValueComparator implements Comparator{
        public int compare(Object o1, Object o2){
            if(o1 instanceof Map.Entry<?,?> && o2 instanceof Map.Entry){
                Map.Entry e1 = (Map.Entry) o1;
                Map.Entry e2 = (Map.Entry) o2;

                int v1 = ((Integer)e1.getValue()).intValue();
                int v2 = ((Integer)e2.getValue()).intValue();

                return v2 - v1;
            }
            return -1;
        }
    }
    private static Object printBar(char c, int a) {
        char[] ch = new char[a];
        for(int i=0; i< ch.length; i++){
            ch[i] = c;
        }
        return new String(ch);
    }
}
