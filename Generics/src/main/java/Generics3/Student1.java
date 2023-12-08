package Generics3;

public class Student1 {
    static int id; // 공간을 할당 받지 않음(정적 변수) , 자원의 공유
     String name;
     String subject;
    public Student1(int id, String name, String subject) {
        this.id = id;
        this.name = name;
        this.subject = subject;
    }

    @Override
    public String toString() {
        // this
        return "Student{" +
                "id=" + id +
                ", name='" + this.name + '\'' +
                ", subject='" + this.subject + '\'' +
                '}';
    }
    
    public static void print(){
       // System.out.println(this.name + "안녕하세요");
        // 클래스 메서드는 인스턴스 자원을 사용할 수 없음
        System.out.println("하이욥!");
        id = 2000;
        System.out.println(id);
    }
}
