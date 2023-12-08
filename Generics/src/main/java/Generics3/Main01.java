package Generics3;

public class Main01 {
    public static void main(String[] args) {
        /*
        * 객체 생성 시에 무엇이 정적 변수인지 알 수 없음
        * 따라서 정적 변수를 사용할땐 클래스명.변수명으로 사용하는 것을 선호
        * */
        Student1 s1 = new Student1(1000, "이름1", "수학");
        Student1 s2 = new Student1(1001, "이름2", "과학");
        Student1 s3 = new Student1(1003, "이름3", "영어");
        System.out.println(s1.toString());
        // toString()은 생성된 후에 실행될 수 있음
        // 객체의 자원을 사용하려면 this 객체가 필요함
        Student1.print();
        System.out.println(s2);
        System.out.println(s3);

        Student1 s4 = s1;
        s4.id = 10;
        System.out.println("===================================================");
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s4);
    }
}
