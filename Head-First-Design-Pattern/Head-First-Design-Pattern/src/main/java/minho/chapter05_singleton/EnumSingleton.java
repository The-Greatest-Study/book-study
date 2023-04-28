package minho.chapter05_singleton;

/*
* enum 타입은 기본적으로 직렬화 가능하므로 Serializable 인터페이스를 구현할 필요가 없고, 리플렉션 문제도 발생하지 않는다.
* 인스턴스가 JVM 내에 하나만 존재한다는 것이 100% 보장 되므로, Java에서 싱글톤을 만드는 가장 좋은 방법으로 권장된다.
* */
public enum EnumSingleton {
    UNIQUE_INSTANCE;
    int value;

    public int getValue() {
        return value;
    }
    public void setValue(int value) {
        this.value = value;
    }
}
