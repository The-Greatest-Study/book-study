# ITEM 19 - 상속을 고려하여 설계
## 상속용 클래스
1. 재정의할 수 있는 메서드들을 내부적으로 어떻게 이용하는지 문서로 남기기
    - 클래스의 API로 공개된 메서드에서 클래스 자신의 또 다른 메서드를 호출 할 수 있음
    - 해당 메서드가 재정의 가능 메서드(**final이 붙지 않은 모든 함수**)이면 그 사실을 호출하는 메서드의 API 설명에 명시해야 함
2. 주석 @implSpec 태그
   - 메서드의 내부 동작 방식을 설명하는 자바DOC
3. HOOK을 잘 선별하여 protected 메서드 형태로 공개
   - 내부 동작 과정 중간에 끼어들 수 있는 것
   - 내부 구현에 해당하므로 수가 가능한 적어야 함
4. 배포 전 반드시 하위 클래스를 만들어 검증
5. 상속용 클래스의 생성자는 직접적으로나 간접적으로 재정의 가능 메서드를 호출하면 안됨
 
 - 잘못된 예 - 생성자가 재정의 가능 메서드를 호출

```java
public class Super{
    public Super(){
        overrideMe();
    }

    public void overrideMe(){

    }
}

public final class Sub extends Super{
    private final Instant instant;

    Sub(){
        instant = Instant.now();
    }

    @Override public void overrideMe(){
        Stystem.out.print(instant);
    }

    public static void main(String[] args){
        Sub sub = new Sub();
        sub.overrideMe();
    }

}
```
 ➡️ 상위 클래스의 생성자가 하위 클래스 생성자보다 먼저 실행되어, 하위 클래스에서 재정의한 메서드가 하위 클래스의 생성자보다 먼저 호출됨: 순서를 예측하기가 어려움