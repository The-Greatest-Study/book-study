# Chapter 16 SerialDate 리팩터링

### 리팩터링 과정 요약

1. 오랜된 주석을 간단하게 고치고 개선했다
2. Enum을 모두 독자적인 소스 파일로 옮겼다
3. 정적 변수 (`dateFormatSymbols`)와 정적 메서드 (`getMonthNames`, `isLeapYear`, `lastDayofMonth`)를 `DateUtil`이라는 새 클래스로 옮겼다
4. 일부 추상 메서드를 `DayDate` 클래스로 끌러올렸다

5. `Month.make`를 `Month.fromInt`로 변경하고 다른 enum도 똑같이 변경했다. 모든 enum에 `toInt()` 접근자를 생성하고 index 필드를 private으로 정의했다
6. `plusYears`와 `plusMonth`의 중복을 제거하기 위해 `LastDayofMonth`라는 새 메서드를 생성해 중복을 없앴다
7. 숫자 1을 없애고, `Month.JANUARY.toInt()`, `Day.SUNDAY.toInt()`로 변경했다.



### 리팩터링 상세 과정 (+코드)

**1. 오랜된 주석을 간단하게 고치고 개선했다**

- Javadoc 주석에 HTML 태그를 사용하는 부분은 바람직하지 않다. 한 소스코드에 여러 언어를 사용하는 대신, Java 언어 주석을 사용하여 고친다
- `SerialDate` 라는 용어가 서술적이지 않을수 있으므로 (날짜는 일련번호가 아니기 때문에), 클래스 명을 `DayDate`로 수정한다



**2. Enum을 모두 독자적인 소스 파일로 옮겼다 / 4. 일부 추상 메서드를 `DayDate` 클래스로 끌러올렸다 **

- `Month` 와 `Day`에 관련된 상수들을 enum으로 정의하였다
- Valid한 Index인지 확인하는 코드도 enum 클래스 안으로 옮겨서 알맞는 값이 들어왔는지 검사하는 코드도 삭제하였다



```java
public abstract class DayDate implements Comparable, Serializable {
  public static enum Month {
    JANUARY(1),
    FEBRUARY(2),
    MARCH(3)
    ...
      
    Month(int index) {
      this.index = index;
    }
    
    public static Month make(int monthIndex) {
      for (Month m : Month.values()) {
        if (m.index == monthIndex)
          return m;
      }
      throw new IllegalArgumentException("Invalid month index " + monthIndex);
    }
  }
}
```



**3. 정적 변수 (`dateFormatSymbols`)와 정적 메서드 (`getMonthNames`, `isLeapYear`, `lastDayofMonth`)를 `DateUtil`이라는 새 클래스로 옮겼다**

- 특정 함수에서만 호출하고, 변동성이 없는 정적 메서드의 경우 `DateUtil` 클래스를 정의해 코드를 한곳에 모아 정리한다



**5. `Month.make`를 `Month.fromInt`로 변경하고 다른 enum도 똑같이 변경했다. 모든 enum에 `toInt()` 접근자를 생성하고 index 필드를 private으로 정의했다**

- Int 타입의 데이터를 입력받아 `Month` 인스턴스를 생성하는 코드가 어딘가에는 한번 필요하다
- 이 작업을 위해 `Month.fromInt()` , `Month.toInt()` 메서드를 생성해 인스턴스를 생성하고, Int값을 반환하는 메서드를 만든다

```java
public enum Month {
  ...
  private int index;
  
  public static Month make(int monthIndex) {
    for (Month m : Month.values()) {
      if (m.index == monthIndex)
        return m;
    }
  
  public int toInt() {
    return index;
  }
}
```



**6. `plusYears`와 `plusMonth`의 중복을 제거하기 위해 `LastDayofMonth`라는 새 메서드를 생성해 중복을 없앴다**

```java
public class DateUtil {
  public static int lastDayofMonth(Month month, int year) {
    if (month == Month.FEBRUARY && isLeapYear(year))
      return month.lastDay() + 1;
    else
      return month.lastDay();
  }
}
```



**7. 숫자 1을 없애고, `Month.JANUARY.toInt()`, `Day.SUNDAY.toInt()`로 변경했다.**



### 느낀점

- 이미 잘 짜여진 코드를 보면서도 더 나은 방향으로 개선할 여지는 없는지를 고민해봐야겠다 (naming, 클래스의 분리 방식, 추상화등)
- 클래스나 변수 이름을 결정할때는 항상 간결하면서도 의미 있는 이름으로 정하자
- 특정 클래스에 있는 메서드가 불필요한 클래스를 상속받아 구현하고 있지는 않은지, 해당 클래스에서 적절한 역할을 구현하고 있는지 고민해보자
- 테스트 케이스를 작성할땐 경계과 엣지 케이스를 모두 생각하며 커버리지가 높은 코드를 작성할 수 있도록 고민해보자