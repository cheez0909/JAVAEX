package exam02;

public class Schedule {
    private int year;
    private int month;
    private int day;

    /**
     * getter와 setter는 관례
     * JAVA_HOME 또한 관례
     */
    public void setYear(int _year) {
        this.year = _year;
    }

    public void setMonth(int _month) {
        this.month = _month;
    }

    public void setDay(int _day) {
        if(_day>=28) _day=28;
        this.day = _day;
    }

    public int getYear() {
        return year;
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }

    @Override
    public String toString() {
        return "Schedule{" +
                "year=" + year +
                ", month=" + month +
                ", day=" + day +
                '}';
    }

    public void  printThis(){
        System.out.println(System.identityHashCode(this));
    }
    void showDate(){
        System.out.printf("yesar=%d, month=%d, day=%d", year, month, day);
    }
}
