package Generics3;

public class Main04 {
    public static void main(String[] args) {
        /*
        * 객체 생성 시에 무엇이 정적 변수인지 알 수 없음
        * 따라서 정적 변수를 사용할땐 클래스명.변수명으로 사용하는 것을 선호
        * */
        System.out.println(Student1.id);

       // 처음부터 공간이 있어야 함
        // 지네릭스는 컴파일 시에 형변환이 된다
        // 스태틱은 처음부터 공간을 할당 받아야함
        Student1.print(); // 클래스 메서드
        Student1.id =1000; // 클래스 변수
        System.out.println(Student1.id);

    }
}
