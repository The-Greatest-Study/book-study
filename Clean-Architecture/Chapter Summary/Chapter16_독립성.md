좋은 아키텍처는 다음을 지원해야 한다.

- 시스템의 유스케이스
- 시스템의 운영
- 시스템의 개발
- 시스템의 배포

## 유스케이스

시스템의 아키텍처는 시스템의 의도를 지원해야 한다.

아키텍트의 최우선 관심사는 유스케이스이며, 아키텍처에서도 유스케이스가 최우선이다. 아키텍처는 반드시 유스케이스를 지원해야 한다.

## 운영

시스템의 운영 지원 관점에서 볼 때 아키텍처는 더 실질적이며 덜 피상적인 역할을 맡는다. 

아키텍처에서 각 컴포넌트를 적절히 격리하여 유지하고 컴포넌트 간 통신 방식을 특정 형태로 제한하지 않는다면, 시간이 지나 운영에 필요한 요구사항이 바뀌더라도 스레드, 프로세스, 서비스로 구성된 기술 스펙트럼 사이를 전환하는 일이 훨씬 쉬워질 것이다.

## 개발

아키텍처는 개발환경을 지원하는 데 있어 핵심적인 역할을 수행한다.

Conway의 법칙
시스템을 설계하는 조직이라면 어디든지 그 조직의 의사소통 구조와 동일한 구조의 설계를 만들어 낼 것이다.

## 배포

즉각적인 배포 immediate deployment 가 목표

시스템이 빌드된 후 즉각 배포할 수 있도록 지원해야 한다.

시스템을 컴포넌트 단위로 적절하게 분할하고 격리시켜야 한다.

## 선택사항 열어놓기

좋은 아키텍처는 컴포넌트 구조와 관련된 이 관심사들 사이에서 균형을 맞추고, 각 관심사 모두를 만족시킨다.

현실에서는 이러한 균형을 잡기가 매우 어렵다. 대부분의 경우 우리는 모든 유스케이스를 알 수는 없으며, 운영하는 데 따르는 제약사항, 팀 구조, 배포 요구사항도 알지 못하기 때문이다. 더 심각한 문제는 이러한 사항들을 알고 있더라도 시스템이 생명 주기의 단계를 하나씩 거쳐감에 따라 이 사항들도 반드시 변해간다는 사실이다.

좋은 아키텍처는 선택사항을 열어둠으로써 향후 시스템에 변경이 필요할 때 어떤 방향으로든 쉽게 변경할 수 있도록 한다.

## 계층 결합 분리

아키텍트는 단일 책임 원칙과 공통 폐쇄 원칙을 적용하여, 그 의도의 맥락에 따라서 다른 이유로 변경되는 것들은 분리하고, 동일한 이유로 변경되는 것들은 묶는다.

⇒ 시스템을 서로 결합되지 않은 수평적인 계층으로 분리하는 방법을 배웠다.

ex.  UI, 애플리케이션에 특화된 업무 규칙, 애플리케이션과는 독립적인 업무 규칙, 데이터베이스 등

## 유스케이스 결합 분리

유스케이스는 시스템을 분할하는 매우 자연스러운 방법이다.

우리는 시스템을 수평적 계층으로 분할하면서 동시에 해당 계층을 가로지르는, 얇은 수직적인 유스케이스로 시스템을 분할할 수 있다.

## 결합 분리 모드

### 개발 독립성

컴포넌트가 완전히 분리되면 팀 사이의 간섭은 줄어든다.

### 배포 독립성

유스케이스와 계층의 결합이 분리되면 배포 측면에서도 고도의 유연성이 생긴다. 

### 중복

예를 들어 두 유스케이스의 화면 구조가 매우 비슷하다고 가정해보자. 아키텍트는 이 구조에 사용할 코드를 통합하고 싶은 유혹을 강하게 느낄 것이다. 그렇지만 우발적 중복일 가능성이 높다. 시간이 지나면서 두 화면은 서로 다른 방향으로 분기하며, 결국에는 매우 다른 모습을 가질 가능성이 높다. 이러한 이유로 해당 코드를 통합하지 않도록 유의해야 한다. 그렇지 않으면 나중에 코드를 다시 분리하느라 큰 수고를 감수해야 한다.

특히, 뷰 모델을 만들어서 보내는 것이 아닌 데이터베이스 레코드를 있는 그대로 UI까지 전달하고 싶은 유혹을 떨쳐내자. 보통 우발적 중복이다

### 계층과 유스케이스의 결합을 분리하는 방법

- 소스 수준 분리 모드 (= monolithic 구조)
소스 코드 모듈 사이의 의존성을 제어할 수 있다.
모든 컴포넌트가 같은 주소 공간에서 실행되고, 서로 통신할 때는 간단한 함수 호출을 사용한다.
- 배포 수준 분리 모드
배포 가능한 단위들 사이의 의존성을 제어할 수 있다.
많은 컴포넌트가 여전히 같은 주소 공간에 상주하며, 단순히 함수 호출을 통해 통신할 수 있다.
어떤 컴포넌트는 동일한 프로세서의 다른 프로세스에 상주하고, 프로세스 간 통신, 소켓, 또는 공유 메모리를 통해 통신할 수 있다.
- 서비스 수준 분리 모드 (= MSA)
의존하는 수준을 데이터 주고 단위까지 낮출 수 있고, 순전히 네트워크 패킷을 통해서만 통신하도록 만들 수 있다.

좋은 아키텍처는 시스템이 모노리틱 구조로 태어나서 단일 파일로 배포되더라도, 이후에는 독립적으로 배포 가능한 단위들의 집합으로 성장하고, 또 독립적인 서비스나 마이크로서비스 수준까지 성장할 수 있도록 만들어져야 한다. 또한 좋은 아키텍처라면 나중에 상황이 바뀌었을 때 이 진행 방향을 거꾸로 돌려 원래 형태인 모노리틱 구조로 되돌릴 수도 있어야 한다.

## 결론

시스템의 결합 분리 모드는 시간이 지나면서 바뀌기 쉬우며, 뛰어난 아키텍트라면 이러한 변경을 예측하여 큰 무리 없이 반영할 수 있도록 만들어야 한다는 점이다.
