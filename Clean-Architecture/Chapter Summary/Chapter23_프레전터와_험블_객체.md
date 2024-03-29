# Chapter23 프레젠터와 험블 객체

### **1. 험블 객체 패턴**
험블객체란
- 디자인 패턴
- 테스트하기 어려운 행위와 테스트하기 쉬운 행위를 단위 테스트 작성자가 쉽게 분리하는 방법으로 고안됨.
- 행위들을 두개의 모듈 또는 클래스로 나눠 본질을 남기고 테스트 하기 어려운 모든 행위를 험블 객체로 옮기는 방식으로 험블(humble)을 구현한다.

<br>

### **2. 프레젠터와 뷰**
험블의 개념을 GUI로 확장시켜보면 프레젠터와 뷰의 다른 클래스로 나눌 수 있다.
- 뷰 : 테스트하기 어려운 험블객체, 데이터를 화면으로 전달하는 간단한 일만 처리.
- 프레전터 : 테스트하기 쉬운 객체, 애플리케이션으로 전달받은 데이터를 화면에 표현할 수 있는 포맷으로 처리.

<br>

**이때 중요한 것은 뷰는 뷰 모델의 데이터를 화면에 로드할 뿐 뷰가 맡은 역할은 전혀 없다는 점이다.**

### **3. 테스트와 아키텍처**
험블 객체의 패턴은 테스트영역에도 활용된다.<br>
테스트가 쉬운 부분과 아닌 부분으로 나누면 아키텍처의 경계가 정의되게 되어 테스트 용이성에 도움을 줄 수 있다.
- 데이터베이스 게이트웨이 : 유스케이스 계층은 필요한 메소드를 제공하는 게이트웨이 인터페이스를 호출하며, 인터페이스 구현체는 데이터베이스 계층에 위치한 험블객체이다.
- 데이터 매퍼 : ORM은 사용자의 관점에서 단순히 오퍼레이션의 집합으로 데이터베이스 계층에 위치하며, 게이트웨이 인터페이스와 데이터베이스 사이 또다른 험블객체를 형성한다.
- 서비스 리스너 : 외부로부터 데이터를 수신하는 서비스의 경우 서비스 인터페이스로부터 데이터를 수신하고 데이터를 애플리케이션에서 사용할 수 있게 간단한 데이터 구조로 포맷을 변경 해 서비스 경계를 가로질러 내부로 전달된다.

<br>

이처럼, 경계를 넘나드는 통신은 거의 모두 간단한 데이터 구조를 수반하는 경우가 많고, <br>
대개 그 경계는 테스트하기 어려운 무언가와 테스트하기 쉬운 무언가로 분리된다. <br>
> 각 아키텍처의 경계마다 경계 가까이 숨어 있는 험블 객체를 사용하면 전체 시스템의 테스트 용이성을 높일 수 있다.