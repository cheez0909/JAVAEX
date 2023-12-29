package exam01;

import java.util.Calendar;

public class Ex02 {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        showDate(cal);

        cal.roll(Calendar.DAY_OF_MONTH, 100); // Calendar.DAY_OF_MONTH이 필드를 100번 돌린다.
        showDate(cal);

        cal.roll(Calendar.MONTH, 13);
        showDate(cal);

        cal.roll(Calendar.DAY_OF_MONTH, 32); // Calendar.DAY_OF_MONTH이 필드를 100번 돌린다.
        showDate(cal);
    }

    private static void showDate(Calendar cal){
        int year = cal.get(Calendar.YEAR);
        int month = cal.get(Calendar.MONTH) + 1; // 0~11
        int date = cal.get(Calendar.DAY_OF_MONTH);

        System.out.printf("year=%d, month=%d, date=%d\n", year, month, date);
    }
}
