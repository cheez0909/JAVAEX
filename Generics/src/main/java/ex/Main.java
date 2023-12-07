package ex;

public class Main {
    public static void main(String[] args) {
        Box box = new Box();
        box.setItem(new Apple()); // 형변환의 번거로움

        Object obj = box.getItem();
        if(obj instanceof Pear){ // 타입의 안정성이 떨어짐
            Pear paer = (Pear) obj;
        }
    }
}
