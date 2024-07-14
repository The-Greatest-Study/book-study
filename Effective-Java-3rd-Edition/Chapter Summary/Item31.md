### ITEM31 (한정적 와일드카드를 사용해 API 유연성을 높이라)
- 불공변(invariant) 방식보다 유연한 방식이 필요하다.
```java
    public void pushAll(Iterable<E> src) {
        for (E e : src)
            push(e);
    }
```
    - stack의 원소 타입과 Iterable src의 원소타입이 잘 맞아야 잘 동작한다.
    - 위의 예에서 Number과 Integer 사용시 매개변수가 invariant하여 타입오류가 난다.
```java
    public void pushAll(Iterable<? extends E> src) {
        for (E e : src)
            push(e);
    }
```
    - 와일드카드 타입을 적용하여 이를 말끔히 컴파일 되도록 변경 가능.
```java
    public void popAll(Collection<? super E> dst) {
        while (!isEmpty())
            dst.add(pop());
    }
```
    - 하위 타입에 대한 와일드카드 타입을 적용하는 것도 마찬가지이다.

- 유연성을 극대화하려면 원소의 생산자나 소비자용 입력 매개변수에 와일드카드 타입을 사용하라.
    - 매개변수화 타입 T가 생상자 -> <? extends T>
                     소비자 -> <? super T>

- 반환 타입에는 클라이언트 코드에서도 와이들카드 타입을 사용해야 한다는 이유로 한정적 와일드카드 타입을 사용하면 안된다.
- 클래스 사용자가 와일드 카드 타입을 신경 써야 한다면 그 API에 무슨 문제가 있을 가능성이 있다.
- java7까지는 명시적 타입 인수를 사용해야 한다.
- 메서드 선언에 타입 매개변수가 한 번만 나오면 와일드카드로 대체하여라.
```java
    public static void swap(List<?> list, int i, int j) {
        swapHelper(list, i, j);
    }

    private static <E> void swapHelper(List<E> list, int i, int j) {
        list.set(i, list.set(j, list.get(i)));
    }
```
- **널리 쓰일 API를 작성한다면 반드시 와일드카드 타입을 적절히 사용해줘야 한다. PECS(생산자 -> extends, 소비자 -> super)**