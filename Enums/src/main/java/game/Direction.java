package game;

public enum Direction {
    EAST("동쪽", 7) {
        @Override
        public int getScore(int i) {
            return i * point;
        }
    },
    WEST("서쪽", -2) {
        @Override
        public int getScore(int i) {
            return i * point;
        }
    },
    NORTH("북쪽", 4) {
        @Override
        public int getScore(int i) {
            return i * point;
        }
    },
    SOUTH("남쪽", -3) {
        @Override
        public int getScore(int i) {
            return i * point;
        }
    };


    protected final String name;
    protected final int point;

    Direction(String name, int point) {
        this.name = name;
        this.point = point;
    }

    public String getName(){return name;}
    public abstract int getScore(int i);
}
