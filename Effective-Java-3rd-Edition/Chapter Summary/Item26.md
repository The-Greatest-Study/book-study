# Item 26. 로 타입은 사용하지 말라

## 제네릭 (Generic)
- 제네릭 클래스 : 클래스 선언에 타입 매개변수 (type parameter)가 쓰인 클래스
- 제네릭 인터페이스 : 인터페이스 선언에 타입 매개변수 (type parameter)가 쓰인 인터페이스

⇒ 제네릭 클래스와 제네릭 인터페이스를 통틀어 제네릭 타입 (generic type)이라 한다.

각각의 제네릭 타입은 일련의 매개변수화 타입 (parameterized type)을 정의한다.

제네릭 타입을 쓰고 싶지만 실제 타입 매개변수가 무엇인지 신경 쓰고 싶지 않다면 물음표(`?` : unbounded wildcard type, 비한정적 와일드 카드 타입)을 사용하자.

## raw type
- 제네릭 타입에서 타입 매개변수를 전혀 사용하지 않을 때 = 타입 매개변수가 없는 제네릭 타입
- 로 타입을 쓰는 걸 언어 차원에서 막아놓지는 않았지만 절대로 써서는 안 된다. 로 타입을 쓰면 제네릭이 안겨주는 안정성과 표현력을 모두 잃게 된다. 
- 절대 써서는 안 되는 로타입을 만든 사유는 호환성 때문이다.
- `List` 같은 로 타입은 사용해서는 안 되나, `List<Object>`처럼 임의 객체를 허용하는 매개변수화 타입은 괜찮다.
  - `List`는 제네릭 타입에서 완전히 발을 뺀 것이다.
  - `List<Object>` 는 모든 타입을 허용한다는 의사를 컴파일러에 명확히 전달한 것이다.
  - `List<String>` : `List`의 하위 타입이지만, `List<Object>` 의 하위 타입은 아니다.
  - 로 타입을 사용하면 타입 안전성을 잃게 된다.
- 로 타입을 사용하는 예외 상황
    - class 리터럴에는 로 타입을 사용
        - 자바 명세는 class 리터럴에 매개변수화 타입을 사용하지 못하게 했다. (배열과 기본 타입은 허용한다.)
    - instanceof 연산자
        - 런타입에는 제네릭 타입 정보가 지워지므로 instanceof 연산자는 비한정적 와일드카드 타입 이외의 매개변수화 타입에는 적용할 수 없다.
        - 로 타입이든 비한정적 와일드카드 타입이든 instanceof는 완전히 똑같이 동작하기 때문에, 코드만 지저분하게 만드는 비한정적 와일드카드 타입 대신 로 타입을 쓰는 것이 훨씬 좋다.

## 핵심 정리
로 타입을 사용하면 런타임에 예외가 일어날 수 있으나 사용하면 안 된다.

로 타입은 제네릭이 도입되기 이전 코드와의 호환성을 위해 제공될 뿐이다.

빠르게 훑어보자면, Set<Object>는 어떤 타입의 객체도 저장할 수 있는 매개변수화 타입이고, Set<?>는 모종의 타입 객체만 저장할 수 있는 와일드카드 타입이다.

그리고 이들의 로 타입인 Set은 제네릭 타입 시스템에 속하지 않는다.

Set<Object>와 Set<?>는 안전하지만, 로 타입인 Set은 안전하지 않다.

## 용어 정의
| 한글 용어         | 영문 용어                   | 예시                               | 관련 아이템 |
|---------------|-------------------------|----------------------------------|--------|
| 매개변수화 타입      | parameterized type      | List<String>                     | 26     |
| 실제 타입 매개변수    | actual type parameter   | String                           | 26     |
| 제네릭 타입        | generic type            | List<E>                          | 26, 29 |
| 정규 타입 매개변수    | formal type parameter   | E                                | 26     |
| 비한정적 와일드카드 타입 | unbounded wildcard type | List<?>                          | 26     |
| 한정적 와일드카드 타입  | bounded wildcard type   | List<? extends Number>           | 31     |
| 로 타입          | raw type                | List                             | 26     |
| 한정적 타입 매개변수   | bounded type parameter  | <E extends Number>               | 29     |
| 재귀적 타입 한정     | recursive type bound    | <T extends Comparable<T>>        | 30     |
| 제네릭 메서드       | generic method          | static <E> List<E> asList(E[] a) | 30     |
| 타입 토큰         | type token              | String.class                     | 33     |