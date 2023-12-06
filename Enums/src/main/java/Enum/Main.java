package Enum;

import static Enum.Transportation.BUS;
import static Enum.Transportation.TAXI;

public class Main {
    public static void main(String[] args) {
        Transportation bus = BUS;
        System.out.println(bus == Transportation.BUS);


        Transportation taxi = Transportation.TAXI;
        System.out.println(taxi);
        System.out.println(taxi.getTitle());

        // 이름, 순서 메서드
        System.out.println("이름 : " + bus.name() + " 순서 : " + bus.ordinal());

    }
}
