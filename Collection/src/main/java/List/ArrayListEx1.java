package List;

import java.util.*;


public class ArrayListEx1 {
    public static void main(String[] args) {

        ArrayList arrayList1 = new ArrayList();
        arrayList1.add(Integer.valueOf(5));
        arrayList1.add(Integer.valueOf(4));
        arrayList1.add(Integer.valueOf(1));
        arrayList1.add(Integer.valueOf(0));
        arrayList1.add(Integer.valueOf(-1));


        // 인덱스 순서로 잘라서 리스트로 저장함
        ArrayList arrayList2 = new ArrayList(arrayList1.subList(1, 4));

        print(arrayList1, arrayList2);
        // list1 : [5, 4, 1, 0, -1]
        // list2 : [4, 1, 0]

        Collections.sort(arrayList1); // 정렬
        Collections.sort(arrayList2); // 정렬

        print(arrayList1, arrayList2);
        // list1 : [-1, 0, 1, 4, 5]
        // list2 : [0, 1, 4]


        // 포함여부 true
        System.out.println(arrayList1.containsAll(arrayList2));


        // 추가
        arrayList2.add("B");
        arrayList2.add("V");
        // 인덱스 3번째 순서에 추가
        arrayList2.add(3, "세번째");
        print(arrayList1, arrayList2);
        // list1 : [-1, 0, 1, 4, 5]
        // list2 : [0, 1, 4, 세번째, B, V]

        // 인덱스 3번째 순서 컨텐츠 변경
        arrayList2.set(3, "Third");
        print(arrayList1, arrayList2);
        // list1 : [-1, 0, 1, 4, 5]
        // list2 : [0, 1, 4, Third, B, V]

        // 겹치는 부분만 남기고 삭제
        System.out.println(arrayList1.retainAll(arrayList2));
        print(arrayList1, arrayList2);
        // list1 : [0, 1, 4]
        // list2 : [0, 1, 4, Third, B, V]


        // arrayList2에서 arrayList1과 동일한 멤버가 있다면 삭제한다.
        // list2.size() - 1 부터 감소시키면서 거꾸로 반복 시켰다.
        // 변수 i를 증가시켜가면서 삭제하면, 한 요소가 삭제될 때마다 빈 공간을 채우기 위해
        // 나머지 요소들이 자리이동을 하기 때문에 올바른 결과를 얻을 수 없다.
        for(int i = arrayList2.size()-1; i>=0; i--){
            if(arrayList1.contains(arrayList2.get(i))){
                arrayList2.remove(i);
            }
        }

        print(arrayList1, arrayList2);
        // list1 : [0, 1, 4]
        // list2 : [Third, B, V]
    }

    private static void print(ArrayList arrayList1, ArrayList arrayList2) {
        System.out.println("list1 : " + arrayList1);
        System.out.println("list2 : " + arrayList2);
    }
}
