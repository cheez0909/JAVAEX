[1. 컬렉션 프레임워크](#-1-컬렉션-프레임워크collection-framework란)<br>
[2. List 인터페이스](#-2-list-인터페이스)<br>
[3. Iterator, ListIterator, Enumeration](#-3-iterator-listiterator-enumeration)<br>
[4. Arrays 클래스](#-4-arrays)<br>
[5. 정렬, Set](#-5-comparator-comparable-set)<br>
[6. Map](#-6-map-인터페이스)<br>
[7. Properties](#-7-properties)<br>

## 📕 1. 컬렉션 프레임워크(collection framework)란?
___
컬렉션 : 다수의 데이터 <br>
프레임워크 : 표준화 설계 <br>
> 즉, 다수의 데이터를 표준화 설계 한 것

[ 🔍 블로그 자세히 보기 ](https://velog.io/@dani0817/JAVA-%EC%BB%AC%EB%A0%89%EC%85%98-%ED%94%84%EB%A0%88%EC%9E%84%EC%9B%8C%ED%81%AC)

<br>

### 📑 Collection
- List
  - 순차 자료구조
  - 순서있고, 데이터의 중복을 허용
  - ArrayList, LinkedList, Stack, Vector
- Set
  - 집합 자료구조
  - 중복허용X, 순서X
  - HashSet, (SoretedSet)구현 -> TreeSet(정렬 기능 추가)

### 📑 Map
- 사전 자료구조
- 키 : 중복을 허용하지 않음 / 반환값 Set
- 값 : 중복을 허용함 / 반환값 Collection
- HashMap(+LinkedHashMap), (SoretedMap) -> TreeMap
- Hashtable, Properties

<br>
<br>

## 📝 2. List 인터페이스
___
#### 📂 `Basics` > 💾 `ArrayListEx1`
`private static final int DEFAULT_CAPCITY = 10;`
`transient Object[] elemetData;`
> 디폴트 공간은 10이다.

<br>

#### 📂 `Basics` > 💾 `ArrayListEx2`
> `ArrayList`는 요소 삭제 후 새로운 배열로 만들어내기 때문에 뒤에서부터 삭제해야 정상적으로 삭제 가능하다.

<br>

#### 📂 `Basics` > 💾 `LinkedListEx1`

> 순차적 추가는 `ArrayList`가 빠르지만, 중간 추가는 `LinkedList`가 빠르다
> 추가나 삭제가 빈번하게 일어날 경우에는 `LinkedList`를 사용하자!

<br>

#### 📂 `Basics` > 💾 `StackQueueEx1`
> 스택은 LIFO의 구조를 갖고, 큐는 FIFO를 갖지만 `PriorityQueue`는 우선순위가 정해져있다.

<br> 
<br>

## 📝 3. Iterator, ListIterator, Enumeration
#### 📂 `Basics` > 💾 `IteratorEx1`
___
- Iterator
  - hasnext() -> 다음 요소 체크
  - next() -> 다음 요소 가져오기

  <br>

- Enumeration(Iterator의 과거 버전)
  - hasMoreElements() -> 다음 요소가 있는지
  - nextElement() -> 다음 요소 가져오기
    
  <br>
  
- ListIterator
  - Iterator의 향상된 버전
  - 양방향으로 반복순회(next(), previous())
  - List 인터페이스를 구현한 컬렉션 클래스



[🔍블로그 자세히보기](https://velog.io/@dani0817/JAVA-%EC%BB%AC%EB%A0%89%EC%85%98-%ED%94%84%EB%A0%88%EC%9E%84-%EC%9B%8C%ED%81%AC-Iterator-ListIterator-Enumeration)

<br>
<br>

## 📝 4. Arrays
#### 📂 `Basics` > 💾 `ArraysEx1`
___
- `copyOf()`, `copyOfRange()` : 배열의 복수
- `fill()`, `setAll()` : 배열 채우기
- `sort()`, `binarySearch()` : 배열의 정렬과 검색
-  `asList(Object... a)` : 배열을 List로 변환

[🔍블로그 자세히보기](https://velog.io/@dani0817/JAVA-Arrays-%ED%81%B4%EB%9E%98%EC%8A%A4)

<br>
<br>

## 📝 5. Comparator, Comparable, Set
#### 📂 `Basics` > 💾 `ComparableEx1`
#### 📂 `Basics` > 💾 `LottoEx1`
#### 📂 `Basics` > 💾 `BookMain`, `Book`
___
> 인터페이스로 컬렉션을 정렬하는데 필요한 메서드를 정의하

[🔍블로그 자세히보기](https://velog.io/@dani0817/JAVA-Comparator-Comparable)

<br>
<br>

## 📝 6. Map 인터페이스
#### 📂 `Basics` > 💾 `HashMapEx1`
#### 📂 `Basics` > 💾 `TreeMapEx1`
___
> 키, 값으로 이루어진 쌍
> TreeMap에서 Compator 재정의
 
<br>
<br>

## 📝 7. Properties
#### 📂 `Basics` > 💾 `PropertiesEx1`
####  💾 `test.properties`
####  💾 `test.xml`
___
> `.store()`메서드와 `FileWriter`를 사용하여 설정파일을 생성할 수 있다.
