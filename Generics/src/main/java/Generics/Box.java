package Generics;



public class Box<T extends Fruit> {
    private  T item;

//    컴파일 시점에 타입변환을 해주기 때문에
//    스태틱, 배열처럼 처음부터 공간을 할당받았을 경우 사용이 불가능하다
//    private static T item2; 스태틱과 배열은 사용불가
//    private T[] item3 = new T[];

    public T getItem() {
        return item;
    }

    public void setItem(T item) {
        this.item = item;
    }

    public void printItem(){
        // T->Fruit 투입된 타입으로 변환
        item.print();
    }
}
