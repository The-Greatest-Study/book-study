## 컴포넌트

- 시스템의 구성 요소로 배포할 수 있는 가장 작은 단위
- 컴파일형 언어 : 바이너리 파일의 집합체
- 인터프리터형 언어 : 소스파일의 결합체

ex. JAVA - jar파일 / 루비 - gem 파일 / 닷넷 - DLL

잘 설계된 컴포넌트라면 반드시 독립적으로 배포 가능한, 따라서 독립적으로 개발 가능한 능력을 갖춰야 한다.

## 컴포넌트의 간략한 역사

### 소프트웨어 개발 초창기

메모리에서의 프로그램 위치와 레이아웃을 직접 제어

origin 구문 : 프로그램이 로드될 주소를 선언

프로그래머가 라이브러리 함수의 소스 코드를 애플리케이션 코드에 직접 포함시켜 단일 프로그램으로 컴파일

### 재배치성

재배치가 가능한 바이너리 (relocatable binary)

지능적인 로더를 사용해서 메모리에 재배치할 수 있는 형태의 바이너리를 생성하도록 컴파일러를 수정하자는 것

⇒ 프로그래머는 함수 라이브러리를 로드할 위치와 애플리케이션을 로드할 위치를 로더에게 지시할 수 있게 되었다.

링킹 로더 linking loader

external reference (외부 참조) : 라이브러리 함수를 호출하는 프로그램의 라이브러리 함수 이름

external definition (외부 정의) : 라이브러리 함수를 정의하는 프로그램의 라이브러리 함수 이름

## 링커

함수 라이브러리는 magnetic tape와 같이 느린 장치에 저장되었다. 

링킹 로더가 로드와 링크, 두 단계로 분리되었다.

링커 linker : 링크가 완료된 재배치 코드를 만든다 → 로더의 로딩 과정이 빨라진다.

1980년대 : C언어나 또 다른 고수준 언어를 사용

소스 모듈은 .c 파일에서 .o 파일로 컴파일 된 후, 링커로 전달되어 빠르게 로드될 수 있는 형태의 실행파일로 만들어졌다.

컴파일하고 링크하는 데 사용 가능한 시간을 모두 소모할 때까지 프로그램은 커진다.


## 결론

런타임에 플러그인 형태로 결합할 수 있는 동적 링크 파일 = 소프트웨어 컴포넌트
