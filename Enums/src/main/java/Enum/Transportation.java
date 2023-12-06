package Enum;

public enum Transportation {
    BUS("버스", 1400) {
        @Override
        public int getFee(int person) {
            return fee * person;
        }
    },
    SUBWAY("지하철", 1400) {
        @Override
        public int getFee(int person) {
            return fee * person;
        }
    },
    TAXI("택시", 4800) {
        @Override
        public int getFee(int person) {
            return fee * person;
        }
    };

    // enum 상수는 상수기 때문에 값이 바뀌지 않는 것이 특징
    // 생성자를 오버로딩할 수 있다.
    private final String title;

    // private으로 할 경우 추상메소드 구현시 변수를 불러올 수 없음
    protected final int fee;

    Transportation(String title, int fee) {
        this.title = title;
        this.fee = fee;
    }

    public String getTitle(){
        return title;
    }

    // Enum 클래스는 추상클래스기 때문에 추상메서드를 정의할 수 있다.
    public abstract int getFee(int person);
}
