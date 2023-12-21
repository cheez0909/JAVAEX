package exam02;

public class ScheduleMain01 {
    public static void main(String[] args) {
        Schedule s1 = new Schedule();
        // s1.year = 2023;
        s1.setYear(2023);
        // s1.month =12;
        s1.setMonth(12);
        /**
         * 12월에 32일은 없는데 검증 가능한가?
         * 멤버변수는 대입과 동시에 들어가기 때문에
         * 통제가 불가능하다
         * 이렇게, 통제가 불가능한 부분을 접근 못하게 차단할 수 있다(권장)
         * public, protected, default, private
         */
        // s1.day=32;
        /**
         * 변수는 바로 메모리에 들어가지만
         * 메서드를 통해 정의하면
         * 통제가 가능하다.
         * 캡슐화, 정보은닉
         */
        s1.setDay(32);
        s1.showDate();
    }
}
