[1. 스트림의 연산](#-1-스트림의-연산)<br>
[1-2. 스트림의 중간연산](#-1-2-스트림의-중간연산)<br>
[2. 스트림 만들기](#-2-스트림만들기)<br>

## 📕 스트림이란?
#### 컬렉션 프레임워크에서 정렬 : Collection.sort()
#### 배열에서 정렬 : Arrays.sort()

> 데이터가 무엇이든지(컬렉션 프레임워크 or 배열 등등)간에 동일한 방식으로 다룰 수 있도록 하는 것

✨ 데이터 처리를 연달아 한꺼번에 진행이 가능하다
> 소스가 간결, 유지 보수성이 좋아짐

<br>
<br>

### 📑 1. 스트림의 연산
#### 💾 `StreamEx1`, 💾 `StreamEx2`
___
#### 중간연산
👉 연산의 결과가 스트림이면 중간연산<br>
#### 최종연산
👉 연산의 결과가 스트림이 아니면 최종연산<br>
#### 지연된연산
#### 기본 자료형을 다루는 스트림

<br>
<br>

### 📑 2. 스트림만들기
#### 💾 `StreamEx3`
___
- 컬렉션
  - `Collection` 인터페이스 -> `stream()`
- 배열
  - `Arrays` 클래스 -> `static stream()`
  - `Stream.of(T[] t)`
  - `Stream.of(T...values)`

- 특정 범위의 정수
  - `IntStream`, `LongStream` 
      - `range(int s, int e);` [s <= X < e]
      - `rangeClosed(int s, int e);` [s <= X <= e]
- 임의의 수
  - java.util.Random()
    - `ints()`
    - `longs()`
    - `doubles()`
- 람다식 : 무한스트림이므로 `limit()`과 함께 사용
  - `iterate()`
  - `generate()`
- 빈 스트림
- 두 스트림의 연결
  - `concat()`

<br>
<br>

### 📑 1-2. 스트림의 중간연산
#### 💾 `StreamEx3`
___
- 스트림 자르기
  - `skip()`, `limit()`
- 스트림 요소 걸러내기
  - `filter()`, `distinct()`
- 정렬
  - `sorted()`
- 변환
  - `map()`
- 조회
  - `peek()`
  - 
