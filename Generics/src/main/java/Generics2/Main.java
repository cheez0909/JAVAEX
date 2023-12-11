package Generics2;

import Generics.Fruit;

public class Main {
    public static void main(String[] args) {
        FruitBox<Apple> appleFruitBox = new FruitBox<>();
        appleFruitBox.add(new Apple());
        appleFruitBox.add(new Apple());
        appleFruitBox.add(new Apple());
        Juicier.make2(appleFruitBox);

        FruitBox<Fruit> fruitBox = new FruitBox<>();
        fruitBox.add(new Pear());
        fruitBox.add(new Apple());
        Juicier.make(fruitBox);
    }
}
