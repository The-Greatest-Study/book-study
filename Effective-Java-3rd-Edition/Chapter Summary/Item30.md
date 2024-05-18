### ITEM30 (이왕이면 제네릭 메서드로 만들라)
- 메서드도 제네릭으로 만들 수 있다.
- Ex) Collection의 binarySearch, sort
    ```java
    public static <E> Set<E> union(Set<E> s1, Set<E> s2) {
        Set<E> result = new HashSet<>(s1);
        result.addAll(s2);
        return result;
    }
    ```
    - (타입 매개변수들을 선언하는) 타입 매개변수 목록은 *메서드의 제한자*와 *반환타입* **사이**에 온다.

- 때때로 불변 객체를 여러 타입으로 활용할 수 있게 만들어야 할 때가 있다.
    - 제네릭 싱글턴 팩터
        ```java
        public static UnaryOperator<Object> IDENTITY_FN = (t) -> t;

        @SuppressWarning("unchecked")
        public static <T> UnaryOperator<T> identityFunction() {
            return (UnaryOperator<T>) IDENTITY_FN;
        }
        ```
    - 재귀적 타입 한정(recursive type bound)를 통하여 타입 매개변수의 허용 볌위를 한정할 수 있다.
        ```java
        public static <E extends Comparable<E>> E max(Collection<E> c) {
            if (c.isEmpty()) {
                throw new IllegalArgumentException("컬렉션이 비어 있습니다.");
            }

            E result = null;
            for (E e : c) {
                if (result == null || e.compareTo(result) > 0)
                    result = Objects.requireNonNull(e);
            }

            return result;
        }
        ```
- **타입과 마찬가지로 형변환을 해줘야 하는 기존 메서드는 제네릭하게 만들자**