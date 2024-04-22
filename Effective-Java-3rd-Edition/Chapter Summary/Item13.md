### ITEM13 (clone 재정의는 주의해서 진행하라)
- Cloneable은 복제해도 되는 클래스임을 명시하는 용도의 인터페이스. 하지만 clone 메서드가 선언된 곳은 protected 의 Object이다.
    - Cloneable은 Object의 protected 메서드인 clone의 동작방식을 결정한다.
- 실무에서는 Cloneable을 구현한 클래스는 clone 메서드를 public으로 제공하며, 사용자는 당연히 복제가 제대로 이뤄지리라 기대한다.
    - 이것은 생성자를 호출하지 않고도 객체를 생성할 수 있게 된다. (위험, 모순)
    - super.clone을 호출하면 상위 객체에 대한 클론이 되어 하위 클래스의 clone이 제대로 동작하지 않는다.
    - clone을 재정의한 클래스가 final이라면 걱정해야 할 하위 클래스가 없으니 괜찮으나, super.clone을 부르지 않는다면 Cloneable을 구현하는 의미가 없음
    - 불변 객체에 대한 하위 객체 clone 메서드 구현
    ```java
    @Override public PhoneNumber clone() {
        try {
            return (PhoneNumber) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
    ```
    - Stack과 같은 가변 객체에 대해 clone을 하면 참조위치가 같아 같은 데이터를 바라보게 된다.
        - 가변 상태를 참조하는 클래스용 clone 메서드 구현
        ```java
        @Override public Stack clone() {
            try {
                Stack result = (Stack) super.clone();
                result.elements = elements.clone();
                return result;
            } catch (CloneNotSupportedException e) {
                throw new AssertionError();
            }
        }
        ```
        - elements 필드가 final이라면 동작하지 않는다.
        - 복제할 수 있는 클래스를 만들기 위해 final을 제거해야 하는 상황이 생길 수 있다.
    - 해시테이블용 clone 메서드
    ```java
    public class HashTable implements Clonable {
        private Entry[] buckets = ...;

        private static class Entry {
            final Object key;
            Object value;
            Entry next;

            Entry(Object key, Object value, Entry next) {
                this.key = key;
                this.value = value;
                this.next = next;
            }

            // 이 엔트리가 가리키는 연결 리스트를 재귀적으로 복사
            Entry deepCopy() {
                return new Entry(key, value, next == null ? null : next.deepCopy());
            }
        }

        @Override public HashTable clone() {
            try {
                HashTable result = (HashTable) super.clone();
                result.buckets = new Entry[buckets.length];
                for (int i = 0; i < buckets.length; i++) {
                    if (buckets[i] != null) {
                        result.buckets[i] = buckets[i].deepCopy();
                    }
                }
                return result;
            } catch (CloneNotSupportedException e) {
                throw new AssertionError();
            }
        }
       ... // 나머지 코드 생략 
    }
    ```
    - 버킷이 너무 길지 않다면 잘 동작 할 것.
    - 연결 리스트를 복제하는 방법으로는 좋지 않은 방법.
    - 스택오버플로 -> deepCopy를 재귀호출 하는 대신 반복자를 써서 순회하도록 해야한다.
    ```java
    Entry deepCopy() {
        Entry result = new Entry(key, value, next);
        for (Entry p = result; p.next != null; p = p.next) {
            p.next = new Entry(p.next.key, p.next.value, p.next.next);
        }
        return result;
    }
    ```
    - 생성자에서는 재정의될 수 있는 메서드를 호출하지 않아야 한다.
    - 복제에 사용할 생성자에서의 put(key, value) 메서드를 예시로 final 혹은 private 이어야 한다.
    - 재정의한 public clone 메서드에서는 throw exception 하지 않아야 사용하기 편하다.
- 상속용 클래스는 Cloneable를 구현해서는 안된다.
```java
@Override protected final Object clone() throws CloneNotSupportedException {
    throw new CloneNotSupportedException();
}
``` 
- 위와 같이 하위 클래스에서 Cloneable을 지원하지 못하게 막을 수 있다.

- Cloneable을 구현한 스레드 안전 클래스에는 clone을 재정의하고 동기화 해줘야한다.

복사 생성자
```java 
public Yum(Yum yum) {...};
```

복사 팩터리
```java
public newInstance(Yum yum) {...};
```
- 복사 생성자와 복사 팩터리는 해당 클래스가 구현한 인터페이스 타입의 인스턴스를 인수로 받을 수 있다.
- 변환 생성자, 변환 팩터리라고 한다.
- 복제본의 타입을 원본 구현 타입에 얽매이지 않고 결정할 수 있다.

-----
**새로운 인터페이스를 만들 때는 절대 Cloneable을 확장해서는 안되며, 새로운 클래스도 이를 구현해서는 안된다**

**복제 기능은 생성자와 팩터리를 이용하는게 최고이다. 단 배열은 clone 메서드 방식이 가장 최적**

-----