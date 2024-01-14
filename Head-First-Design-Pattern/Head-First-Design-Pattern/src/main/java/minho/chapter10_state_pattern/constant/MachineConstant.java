package minho.chapter10_state_pattern.constant;

public final class MachineConstant { // final로 상속을 막음

    private MachineConstant() {} // private으로 객체 생성을 막음

    /*
     * import static 구문을 활용하여 상수에 접근하여 Anti-pattern인 Constant Interface와 동일한 기능과 편리성을 제공받는다.
     *
     * Constant Interface의 문제점
     *      - Implements 할 경우 사용하지 않을 수도 있는 상수를 포함하여 모두 가져오기 때문에 계속 가지고 있어야 한다.
     *      - 컴파일할 때 사용되겠지만, 런타임에는 사용할 용도가 없다. (Marker Interface는 런타임에 사용할 목적이 있으므로 다름)
     *      - Binary Code Compatibility (이진 호환성)을 필요로 하는 프로그램일 경우, 새로운 라이브러리를 연결하더라도,
     *          상수 인터페이스는 프로그램이 종료되기 전까지 이진 호환성을 보장하기 위해 계속 유지되어야 한다.
     *      - IDE가 없으면, 상수 인터페이스를 Implements 한 클래스에서는 상수를 사용할 때 네임스페이스를 사용하지 않으므로,
     *          해당 상수의 출처를 쉽게 알 수 없다. 또한 상수 인터페이스를 구현한 클래스의 하위 클래스들의 네임스페이스도 인터페이스의 상수들로 오염된다.
     *      - 인터페이스를 구현해 클래스를 만든다는 것은, 해당 클래스의 객체로 어떤 일을 할 수 있는지 클라이언트에게 알리는 행위이다.
     *          따라서 상수 인터페이스를 구현한다는 사실은 클라이언트에게는 중요한 정보가 아니다. 다만, 클라이언트들을 혼동시킬 뿐이다.
     *      - 상수 인터페이스를 Implements 한 클래스에 같은 상수를 가질 경우,
     *          클래스에 정의한 상수가 사용되므로 사용자가 의도한 흐름으로 프로그램이 돌아가지 않을 수 있다.
     *
     * 참고 : https://www.baeldung.com/java-constants-good-practices
     */
    public static final int SOLD_OUT = 0;
    public static final int NO_QUARTER = 1;
    public static final int HAS_QUARTER = 2;
    public static final int SOLD = 3;
}
