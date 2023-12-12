
public class Student implements Comparable<Student>{
    private String name;
    private int ban;
    private int totalScore;

    public Student(String name, int ban, int totalScore) {
        this.name = name;
        this.ban = ban;
        this.totalScore = totalScore;
    }

    public String getName() {
        return name;
    }

    public int getBan() {
        return ban;
    }

    public int getTotalScore() {
        return totalScore;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", ban=" + ban +
                ", totalScore=" + totalScore +
                '}';
    }

    /**
     * 성적이 높은 순으로 정렬
     */
    @Override
    public int compareTo(Student o) {
        return  o.totalScore - this.totalScore;
    }
}
