#### 🔍 자바스크립트로 알아보는 람다식
```javascript
function abc(num1, num2){
    return num1 + num2;
}
abc = 100; // 값 설정이 가능함
```
> `abc`는 함수명이 아닌 변수명
> abc = 100; 으로 값을 설정할 수 있음.

<br>

🔴 예시
```javascript
const nums = [1,2,3,4,5,6,7,8,9,10]
const nums2 = nums.map(function(num){
    return num * num;
});
console.log(nums2); 
```
#### 🔵 결과
```javascript
[
   1,  4,  9, 16,  25,
  36, 49, 64, 81, 100
]
```



#### 🔴 람다식으로 표현할 경우
```javascript
const nums3 = nums.map(x=>x*x);
console.log(nums3);
```
<br>
<br>

### 📕 람다식이란?
메서드(함수)를 하나의 식으로 표현
> 함수형 프로그래밍을 사용하기 위해서
> 다중 언어 프로그래밍을 위해 (여러 언어와 호환)
<br>

#### 함수형 프로그래밍
#### ❓ 함수란? 
- 하나의 기능(단일 기능)
- 함수는 값으로 사용할 수 있다 (매개변수, 반환값)
> 자바는 함수를 값으로 사용할 수 없다.

<br>
 
#### ❗ 인터페이스 객체가 되는 조건을 이용
- 추상메서드 구현
- 형식을 단순화
 
<br>

`@FunctionalInterface` : 추상메서드가 1개만 정의되어 있는 지를 체크


#### 📝 `java.util.function` 패키지
___
### 함수형 인터페이스를 정의해 둔 패키지 <br>

1) 매개변수가 없고 반환값이 있는 형태 <br>
`supplier : R get()` <br>

2) 매개변수가 1개, 반환값은 없음 <br>
`Consumer : void accept(T t)`<br>

3) 매개변수가 1개, 반환값 있음<br>
`Function : R apply(T t)` <br>

4) 매개변수가 1개, 반환값 boolean<br>
`Predicate : boolean test(T t)` <br>

5) 매개변수 1개, 반환값 있음, 매개변수 자료형과 반환값 자료형이 같다
`UnaryOperator<T> : Function<T, T> -> T apply(T t)`

### `Bi` 접두어가 붙으면 매개변수가 2개 이다.
1) 매개변수가 2개, 반환값은 없음 <br>
   `BiConsumer<T, U> : void accept(T t, U u)`<br>

2) 매개변수가 2개, 반환값 있음<br>
   `BiFunction<T, U, R> : R apply(T t, U u)` <br>

3) 매개변수가 2개, 반환값 boolean<br>
   `BiPredicate<T, U> : boolean test(T t, U u)` <br>

4) 매개변수가 2개 반환값 O<br>
`BinaryOperator<T> : `<br>

<br>
<br>

#### Function의 합성과 Predicate의 결합( 💾 `Main4` )
#### ✅ Function
- f.andThen(g) -> f -> g결합
- g.compose(f) -> f -> g결합
#### ✅ Predicate : 조건식
- and(...)
- or(...)
- negate(...) : 부정(not) -> 참일때 거짓, 거짓일때 참

<br>
<br>

메서드 참조
