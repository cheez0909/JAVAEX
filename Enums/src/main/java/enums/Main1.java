package enums;
public class Main1 {
    public static void main(String[] args) {
        String str = "TAXI";

        Transportation trans = Enum.valueOf(Transportation.class, str); // 문자열 -> Enum상수로 변환
        System.out.println(trans);

        // 모든 생성자는 private
        System.out.println(Transportation.BUS instanceof Transportation);


        Transportation trans1 = Transportation.TAXI;
        System.out.println(trans1.getTitle());
        System.out.println(trans.getFee(5));
    }
}
