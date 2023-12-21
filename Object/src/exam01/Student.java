package exam01;

public class Student {
    static int id; // 정적변수
    String name;
    String subject;

    public Student(int _id, String _name, String _subject) {
        this.id = _id;
        this.name = _name;
        this.subject = _subject;
    }
    void showInfo(){
        System.out.printf("id=%d, name=%s, subject=%s\n", id, name, subject);
    }
}
