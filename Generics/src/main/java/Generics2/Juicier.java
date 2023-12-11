package Generics2;


import Generics.Fruit;

public class Juicier {
    
    
//    컴파일 시 형변환이 되므로 아래 두 메소드는 같은 메소드가 됨
//    메서드 중복정의
//    public static void make(FruitBox<Apple> appleFruitBox){
//
//    }
//
//    public static void make(FruitBox<Pear> pearFruitBox){
//
//    }
    
//    ? -> 와일드 카드 무엇이 투입돼도 됨
//    public static void make(FruitBox<? extends Fruit> fruitBox){
//        System.out.println(fruitBox.getItems());
//    }

    public static void make(FruitBox<? extends Fruit> fruitBox){
        System.out.println(fruitBox.getItems());
    }

    public static <T extends Fruit> void make2(FruitBox<T> fruitBox){

        System.out.println(fruitBox.getItems());
    }
}
