/**
 * 1. 작성자 : Dani
 * 2. 작성일 : 12월 10일
 * 3. 로또 게임 만들어보기
 */
package Basics;

import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public class LottoEx1 {
    public static void main(String[] args) {
        HashSet<Integer> lotto = new HashSet<>(); // 중복되는 숫자 제거

        while (lotto.size()<6){
            int num = (int) (Math.random() * 45) + 1;
            lotto.add(num);
        }


        Iterator<Integer> iterator = lotto.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
