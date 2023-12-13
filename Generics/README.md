[1. 지네릭스란?](#-generics지네릭스란)<br>
[2. 지네릭의 제한](#-지네릭스의-제한)<br>
[3. 제한된 지네릭 클래스](#-제한된-지네릭-클래스)<br>
[4. 와일드 카드](#-와일드-카드)<br>
[5. 지네릭 메서드](#-지네릭-메서드)<br>

![img_1.png](img_1.png)
> Generics3 -> Main클래스


## 📕 Generics(지네릭스)란?
- 지네릭스는 다양한 타입의 객체들을 다루는 메서드나 컬렉션 클래스에 컴파일시의 타입체크(compile-time type check)를 해주는 기능이다.
- 객체의 타입을 컴파일 시에 체크하기 때문에 객체의 **타입 안정성**을 높이고 **형변환의 번거로움이 줄어든다**

<br>

### 📝 지네릭의 사용 후 제거
_컴파일러는 지네릭 타입을 이용해서 소스파일을 체크하고 필요한 곳에 형변환을 넣어준다. 그리고 지네릭 타입을 제거한다. 즉, 컴파일된 파일(*.class)에는 지네릭에 대한 정보가 없는것이다._
> 지네릭 타입은 컴파일러가 컴파일할 떄만 사용하고 제거해버린다.

#### 🔴 일반 형식
```java
public class Box {
    private  Object item;

    public Object getItem() {
        return item;
    }

    public void setItem(Object item) {
        this.item = item;
    }
}
```
#### 🔴 지네릭 클래스

```java
public class Box<T> {
    private  T item;

    public T getItem() {
        return item;
    }

    public void setItem(T item) {
        this.item = item;
    }
}
```

>Box에서 T를 '타입 변수(type variable)'라 하며 Type의 첫 글자에서 따온 것이다.

_타입 변수는 다른 것을 사용해도 되며, 의미 적으로 E(Element), K(Key), V(Value)등을 관례적으로 많이 사용한다. 기호의 종류만 다를 뿐 임의의 참조형 타입을 의미한다는 것은 모두 같다._

- 예) ArrayList의 경우 타입 변수 E는 Element(요소)의 첫글자를 따서 사용
- 예) Map<K,V>에서 K는 Key(키)를 의미하고, V는 Value(값)을 의미한다.

<br>

#### 🔴 지네릭타입 호출
```java
Box<String> b = new Box<String>(); // 컴파일 후에 T 대신 실제 타입을 지정
b.setItem("사과");
String item = b.getItem();
```

<br>

#### ✨ 지네릭 클래스의 변환
```java
public class Box<String> {  // 타입을 String으로 변환
    private  String item;

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }
}
```

<br>
<br>


### 📝 지네릭스의 용어
#### `Class Box<T> {}`

- `Box<T>` : 지네릭 클래스, 'T의 Box' 또는 'T Box'라고 읽는다.
- `T` : 타입 변수 또는 타입 매개변수.(T는 타입문자)
- `Box` : 원시 타입(raw type)


<br>
<br>




### 📝 지네릭스의 제한
<span style="background-color:yellow">**static멤버에 타입 변수 T를 사용할 수 없다**</span>
> 컴파일 되면서 타입이 변환되므로 메서드 중복으로 인식한다.

- 지네릭 타입의 배열을 생성하는 것도 허용하지 않는다.
- 지네릭 배열 타입의 참조변수를 선언하는 것은 가능하지만, `new T[10]` 과 같이 배열을 생성하는 것은 불가하다. 지네릭 배열을 생성할 수 없는 것은 new 연산자 때문인데, 이 연산자는 컴파일 시점에 타입 T가 뭔지 정확히 알아야 한다.
- new 연산자와 같은 이유로 instanceof 연산자도 T를 피연산자로 사용할 수 없다.
> 지네릭 클래스는 컴파일하는 시점에서는 T가 어떤 타입이 될지 전혀 알수 없기 때문이다.(지네릭은 인스턴스가 만들어질때 T 타입이 결정된다.)

#### 🔴 예시
```java
 class Box<T> {
 	T[] itemArr; // OK, T타입의 배열을 위한 참조변수
 	...
 	T[] toArray() {
 		T[] tmpArr = new T[itemArr.length]; // 에러. 지네릭 배열 생성불가
 		...
 		return tmpArr;
 	}
 	...
 }
```

<br>
<br>

### 📝 제한된 지네릭 클래스
_타입 문자로 사용할 타입을 명시하면 한 종류의 타입만 저장할 수 있도록 제한할 수 있지만, 여전히 모든 종류의 타입을 지정할 수 있는 것에는 변함이 없다. 타입 매개변수 T에 지정할 수 있는 타입의 종류를 제한할 수 있는 방법이 있다._
#### 🔴 예시 (extends사용)
```java
public class FruitBox<T extends Fruit> {
    private List<T> items = new ArrayList<>();

    public void add(T item){
        items.add(item);
    }

    @Override
    public String toString() {
        return "FruitBox{" +
                "items=" + items +
                '}';
    }

    public List<T> getItems(){
        return items;
    }
}
```
> `interface Eatable {}`
`class FruitBox<T extends Eatable> { ... }`
인터페이스를 구현해야 하는 경우도 사용 가능
`class FruitBox<T extends Fruit & Eatable> { ... }`로 인터페이스와 클래스 모두 사용 할 수 있다.

<br>
<br>

### 📝 와일드 카드
```java
public class Juicier {
    
    
    // 컴파일 시 형변환이 되므로 아래 두 메소드는 같은 메소드가 됨
    // 메서드 중복정의
    public static void make(FruitBox<Apple> appleFruitBox){

    }
    public static void make(FruitBox<Pear> pearFruitBox){

    }
    
    // ? -> 와일드 카드 무엇이 투입돼도 됨
    public static void make(FruitBox<? extends Fruit> fruitBox){
        System.out.println(fruitBox.getItems());
    }
 ```

 <br>
<br>

### 📝 지네릭 메서드
#### 🔴 와일드 카드 사용
```java
public class Juicier {
    public static void make(FruitBox<? extends Fruit> fruitBox){
        System.out.println(fruitBox.getItems());
}
```
#### 🔴 지네릭 메서드
 ```java
public class Juicier {
    public static <T extends Fruit> void make(FruitBox<T> fruitBox){
        System.out.println(fruitBox.getItems());
}
```