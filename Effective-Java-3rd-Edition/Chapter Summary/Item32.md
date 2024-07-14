### ITEM32 (제네릭과 가변인수를 함께 쓸 때는 신중하라)
- 가변인수(varargs)는 메서드에 넘기는 인수의 개수를 클라이언트가 조절할 수 있게 해주는데 구현 방식에 허점이 있음.
    - 가변인수를 담기위한 배열이 자동으로 생성된다. 내부에 감춰야할 이 배열이 클라이언트에 노출되게 됨.
    - 여기서 매개변수에 제네릭이나 매개변수화 타입이 포함되면 알기 어려운 컴파일 경고가 발생.

```java
    static void dangerous(List<String>... stringLists) {
        List<Integer> intList = List.of(42);
        Object[] objects = stringLists;
        object[0] = intList;                // 힙 오염 발생
        String s = stringLists[0].get(0);   // ClassCastException
    }
```
    - 제네릭 varargs 배열 매개변수 값에 저장하는 것은 안전하지 않다.

- @SafeVarargs(in java7) annotation은 메서드 작성자가 그 매서드가 타입 안전함을 보장하는 장치.
```java
    @SafeVarargs
    static <T> List<T> flatten(List<? extends T>... lists) {
        List<T> result = new ArrayList<>();
        for (List<? extends T> list : lists) {
            result.addAll(list);
        }
        return result;
    }
```
    - 제네릭이나 매개변수화 타입의 varargs 매개변수를 받는 모든 메서드에 @SafeVarargs를 달라.
    - @SafeVarargs 는 재정의 할 수 없는 메서드에만 달아야 함. 재정의한 메서드도 안전할지는 보장이 안되기에..

- 배열없이 제네릭만 사용한 예(타입 안전)
```java
     static <T> List<T> pickTwo(T a, T b, T c) {
        switch(ThreadLocalRandom.current().nextInt(3)) {
            case 0: return List.of(a, b);
            case 1: return List.of(a, c);
            case 2: return List.of(b, c);
        }
        throw new AssertionError();
     }
```

- **가변인수와 제네릭은 궁합이 좋지 않다. 가변인수 -> 매개변수 배열이 노출되어 추상화가 좋지 않고, 배열과 제네릭의 타입 규칙은 또 다르기 때문. 제네릭 varargs는 타입안전하지는 않지만 허용되기에 @SafeVarargs annotation과 함께 사용하도록 하자**