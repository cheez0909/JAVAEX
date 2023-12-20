package ObjectEx;

public class StudentMain {
    public static void main(String[] args) {
        Student s1 = new Student(1000, "학생1", "과목1");
        s1.showInfo();

        Student s2 = new Student(2000, "학생2", "과목2");
        s2.showInfo();

        s1.showInfo(); // 정적변수는 모든 인스턴스들이 값을 공유한다

//        streamStudy.Student s3 = s2; // 주소값만 복사 한 것
//        s3.id = 1001;
//        s3.name = "(수정)학생";
//        s3.showInfo();
//        s2.showInfo();
//
//        System.out.println(System.identityHashCode(s1)); // 가상의 주소값
//        System.out.println(System.identityHashCode(s2)); // 가상의 주소값
//        System.out.println(System.identityHashCode(s3)); // 가상의 주소값
    }
}
