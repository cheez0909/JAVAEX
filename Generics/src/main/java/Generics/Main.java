package Generics;

public class Main {
    public static void main(String[] args) {
        Box<Apple> appleBox = new Box<>(); // 컴파일 시점에 T -> Object로 변환 됨
        appleBox.setItem(new Apple());
        appleBox.getItem().print();
        Box<Pear> pearBox = new Box<Pear>();
        pearBox.setItem(new Pear());
        pearBox.getItem().print();
    }
}
