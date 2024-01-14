# 상태 패턴 (Status Pattern)

객체의 내부 상태가 바뀜에 따라 객체의 행동을 바꾸는 것
- 상태 클래스를 구현하여 조건문 코드를 없앨 수 있음


## 상태패턴 vs 전략패턴
### 상태패턴
- 상태 객체의 일련의 행동이 캡슐화 됨
- Context 객체에게 모든 행동을 맡김
- 클라이언트는 객체의 상태를 몰라도 됨

### 전략패턴
- 클라이언트가 Context 객체에게 어떤 전략을 사용할 것인지 지정해줌
- 서브클래스를 만드는 방법으로 대신하여 유연성을 극대화 할 때 사용

https://www.robotstory.co.kr/raspberry/?mode=view&board_pid=80

### 차이점
- 어디에서 상태를 셋팅해주는 것이냐에 따라서 구분 할 수 있다.
```java
// 전략패턴
public static void main(String[] args){

    Example ex = new Example();
    Status st = new Status();

    //메인, 즉 클라이언트가 상태를 직접 지정
    ex.setStatus(status);
    ex.run();
}

// 상태 패턴
public static void mian(String[] args){

    Status st = new Status();

    st.run();
    st.run();
}

public class A implements Status(){

    public void run(Status st){
        st.setStatus(B);
    }
}

public class B implements Status(){
    public void run(Status st){
        st.setStatus(A);
    }
}
```

