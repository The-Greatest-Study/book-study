### ITEM14 (Comparable을 구현할지 고려하라)
- compareTo!!
- 단순 동치성 비교에 추가하여 순서 비교가 가능하고 제네릭하다.
- equals와 규약이 비슷하다. 오히려 타입이 다른 객체에 대해 신경 쓰지 않아도 된다. (다른 타입에 대한 예외 처리)
- TreeSet, TreeMap, Collections, Arrays 와 같은 비교를 활용하는 클래스를 사용하려면 규약을 지켜야 한다.
    - 앞선 equals 규약과 같이 반사성, 대칭성, 추이성을 지켜야한다.
    - 필수는 아니지만 지켜야할 규약 compareTo 메서드로 수행한 동치성 테스트 결과가 equals와 같아야 한다.
    - HashSet(equals): 다른 해쉬값을 가지지만 TreeSet(compareTo): 하나의 원소를 가진다.

- Comparable은 타입을 인수로 받는 제네릭 인터페이스.
    - compareTo 메서드의 인수 타입은 컴파일타임에 정해진다. 인수의 타입이 잘못됬다면 컴파일이 되지 않는다.
    - Comparable 미구현 혹은 표준이 아닌 순서의 비교에는 Comparator을 사용한다.

- compareTo 메서드에서 관계 연산자 <와>를 사용하는 이전 방식은 이제 추천하지 않는다. -> compare 사용 (java7~)
```java
public int compareTo(PhoneNumber pn) {
    int result = Short.compare(areaCode, pn.areaCode);
    if (result == 0) {
        result = Short.compare(prefix, pn.prefix);
        if (result == 0) {
            result = Short.compare(lineNum, pn.lineNum);
        }
    }
    return result;
}
```

비교자 생성 메서드를 활용한 비교자 (java8)
```java
private static final Compartor<PhoneNumber> COMPARATOR = comparingInt((PhoneNumber pn) -> pn.areaCode)
    .thenComparingInt(pn -> pn.prefix)
    .thenComparingInt(pn -> pn.lineNum);

public int compareTo(PhoneNumber pn) {
    return COMPARATOR.compare(this, pn);
}
```
정적 compare 메서드를 활용한 비교자
```java
static Comparator<Object> hashCodeOrder = new Comparator<>() {
    public int compare(Object o1, Object o2) {
        return Integer.compare(o1.hashCode(), o2.hashCode());
    }
}
```
비교자 생성 메서드를 활용한 비교자
```java
Comparator<Object> hashCodeOrder = Comparator.comparingInt(o -> o.hashCode());
```

**박싱된 기본 타입 클래스가 제공하는 정적 compare 메서드나 Comparator 인터페이스가 제공하는 비교자 생성 메서드를 이용하자**