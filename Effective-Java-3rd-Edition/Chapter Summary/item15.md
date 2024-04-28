# ITEM 19 - 클래스와 멤버의 접근 권한을 최소화하라

### 정보를 숨겨야 하는 이유
- **개발 속도를 높힌다**: 여러 컴포넌트를 병렬로 개발할 수 있어, 개발 속도를 높힌다
- **시스템 관리 비용을 낮춘다**: 각 컴포넌트를 더 빨리 파악하여 디버깅할 수 있고, 컴포넌트 교체 부담이 적어지기 때문이다
- **성능 최적화에 도움을 준다**: 완성된 시스템을 프로파일링해 최적화할 컴포넌트를 정한 다음, 다른 컴포넌트에 영향을 주지 않고 해당 컴포넌트만 최적화할 수 있기 때문이다
- **소프트웨어 재사용성을 높힌다**: 독자적으로 사용 가능한 컴포넌트라면 다른 환경에서도 유용하게 사용될 수 있다
- **큰 시스템을 제작하는 난이도를 낮춰준다**: 시스템 전체가 완성되지 않은 상태에서도 개별 컴포넌트의 동작을 검증할 수 있다

### 자바의 접근 제한자
멤버 (필드, 메서드, 중첩 클래스, 중첩 인터페이스)에 대한 접근 제한자는 아래 네가지로 나눠진다.
##### 공개 API에 영향을 주지 않는 제한 레벨
- **private**: 멤버를 선언한 톱레벨 클래스에서만 접근 가능
- **package-private**: 해당 파일이 있는 패키지 안에서만 사용 가능, 접근 제한자를 명시하지 않았을때 기본적으로 적용되는 접근 수준 (interface의 멤버는 기본적으로 public)
<hr>

##### 공개 API가 될 수 있는 제한 레벨
- **protected**: package-private의 접근 범위를 포함하며, 이 멤버를 선언한 클래스의 하위 클래스에서도 접근할 수 있다
- **public**: 공개 API로 선언

### 접근 제한자를 정의할 때 고려해야 될 사항들
1. 공개 API 설계 후, 그 외 모든 멤버는 `private`으로 만들자
2. `public` 클래스의 인스턴스 필드는 되도록 `public`이 아니어야 한다
   - 해당 필드에 담을 수 있는 값을 제한할 수 없게 된다
   - 꼭 필요한 구성요소로써의 상수라면 `public static final` 필드로 공개해도 좋다
   - `public static final`을 사용하더라도 길이가 0이 아닌 배열은 변경 가능하니 주의하자
     상수 배열을 사용해야 한다면 아래와 같이 반환할 수 있다
   ```java
   public static final Thing[] PRIVATE_VALUES = {...};
   
   // 1. private 배열 -> public 불변 리스트로 반환
   public static final List<Thing> VALUES =
        Collections.unmodifiableList(Arrays.asList(PRIVATE_VALUES));
   
   // 2. private 배열 -> 배열의 복사본을 반환하는 public 메서드 작성
   public static final Thing[] values() {
        return PRIVATE_VALUES.clone();
   } 
   ```
3. Java 9 버전부터 도입된 모듈 시스템을 사용하면, export 되지 않은 모듈의 멤버들은 접근제한자와 상관없이 접근이 불가능 하게 된다.
   하지만 의도치 않은 side effect들이 있을 수 있으니 사용시 주의가 필요하다