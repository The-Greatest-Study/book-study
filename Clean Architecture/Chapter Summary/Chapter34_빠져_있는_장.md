코드를 조직화 (패키지화) 하는데 여러가지 방식이 존재한다

### 1. 계층 기반 패키지
기술적인 관점에서 코드가 하는 일에 기반해 수평적으로 코드를 분할하는 방식

- Controller: 웹 컨트롤러이며, 웹 기반 요청을 처리한다
- Service: 업무 규칙을 정의한다
- Repository: 영구 저장된 주문 정보에 접근하는 방법을 정의한다

```
controller
	|_OrderController 
service
	|_ OrderService
	|_ OrderServiceImpl
repository
	|_ OrderRepository
	|_ JdbcOrderRepository
```

> 장점: 단순한 구조로 코드를 작동시켜준다
> 단점: 복잡한 소프트웨어에서는 확장성이 부족하다, 업무 도메인에 대해 말해주지 않는다


### 2. 기능 기반 패키지
서로 연관된 기능, 도메인 개념, 또는 Aggregate Root에 기반하여 수직의 얇은 조각으로 코드를 나누는 방식

```
order
	|_OrderController 
	|_ OrderService
	|_ OrderServiceImpl
	|_ OrderRepository
	|_ JdbcOrderRepository
```

> 장점: 코드의 상위 수준 구조가 업무 도메인에 대해 설명해준다, 유스케이스가 변경될 경우 변경해야 할 코드를 모두 찾는 작업이 더 쉬워진다

### 3. 포트와 어댑터 / 육각형 아키텍처
업무 / 도메인에 초점을 둔 코드를 프레임워크나 데이터베이스 같은 기술적인 세부 구현과 독립적으로 분리될 수 있도록 설계한 아키텍처

- 내부: 도메인 개념을 포함
- 외부: UI, 데이터베이스, 서드파티 통합등을 포함

```
web
	|_ OrderController
domain
	|_ OrderService
	|_ OrderServiceImpl
	|_ Order
database
	|_ JdbcOrderRepository
```


### 4. 컴포넌트 기반 패키지
큰 단위의 단일 컴포넌트와 관련된 모든 책임을 하나의 자바 패키지로 묶는 방식

소프트웨어 시스템 -> 컨테이너 (웹 어플리케이션, 데이터베이스, 파일 시스템 등...) -> 컴포넌트 (각 컨테이너를 구현하는 하나 이상의 클래스)

```
web
	|_ OrderController
order
	|_ OrderService
	|_ OrderServiceImpl
	|_ OrderRepository
	|_ JdbcOrderRepository
```

> 장점: 무언가 추가 / 수정을 해야할 때 한곳에서만 작업하도록 할 수 있다 (MSA, 서비스지향 아키텍처와 유사)
> MSA로 가기 위한 발판으로 삼을 수 있다