package exam01;

import java.util.Calendar;

public class Ex01 {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        showDate(cal);
        /**
         * 날짜가 바뀌면 원래 객체의 날짜가 바뀜
         * 원래 날짜를 알 수 없게 됨
         * 원래 날짜가 필요할 때가 있음
         * time 패키지 에서는 날짜, 시간 변경시 새ㅗ운 객체가 생성됨
         */
        cal.set(Calendar.DAY_OF_MONTH, 10);
        showDate(cal);

        cal.add(Calendar.DAY_OF_MONTH, 100);
        showDate(cal);

        cal.add(Calendar.DAY_OF_MONTH, -100);
        showDate(cal);
    }

    private static void showDate(Calendar cal){
        int year = cal.get(Calendar.YEAR);
        int month = cal.get(Calendar.MONTH) + 1; // 0~11
        int date = cal.get(Calendar.DAY_OF_MONTH);

        System.out.printf("year=%d, month=%d, date=%d\n", year, month, date);
    }
}
