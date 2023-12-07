### 📕 1. 애너테이션 이란?
___
- 프로그램의 소스코드 안에 다른 프로그램을 위한 정보를 미리 약속된 형식으로 포함시킨 것.
- 주석, 주해, 메모


```java
@Override
public void method(){
    
}
```
> 이 메서드가 재정의 됐음을 알려준다. 메서드 자체에는 영향을 미치지 않음.

<br>

#### 🔍`@Override`의 API

```java
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.SOURCE)
public @interface Override {
}
```
#### 📝 1-1. `메타 애너테이션
- 애너테이션을 위한 애너테이션
- 애너테이션을 붙이는 애너테이션으로 애너테이션을 정의할 때 애너테이션의 적용대상(target)이나 유지기간(retention)등을 지정하는데 사용된다.
- 메타 애너테이션은 "java.lang.annotation" 패키지에 포함되어 있다.
- 
> `@Target(ElementType.METHOD)` -> 타겟이 Enum상수로 정의되어 있다. 적용대상을 나타냄
> `@Retention(RetentionPolicy.SOURCE)` -> 시점에 대한 애너테이션. 애너테이션이 유지되는 기간

#### 🔍`@Retention(RetentionPolicy.SOURCE)`의 API
```java
public enum RetentionPolicy {

    SOURCE, //  소스 파일에만 존재, 클래스 파일 존재X -> 컴파일 시점에 정보가 전달됨, 컴파일 이후에 제거
    CLASS, // 자바코드에 존재(java), 클래스 파일에 존재(class) -> 디폴트값, 정보전달X(거의 사용X)
    RUNTIME // 자바코드에 존재(java), 클래스 파일에 존재(class) -> 실행 중에 정보가 전달(많이 사용)
}
```

<br>
 
#### 📝 1-1. `표준 애너테이션`
