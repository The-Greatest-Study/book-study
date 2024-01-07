package jihong.chapter05_Sigleton;

/**
 * Enum
 * private 생성자로 인스턴스 생성을 제어하며,
 * 상수만 갖는 특별한 클래스
 */
public class _5EnumSingleton {
    public static void main(String[] args) {
        EnumSingleton singleton = EnumSingleton.UNIQUE_INSTANCE;

        // 자바에서 싱클톤패턴 사용 예시
        Runtime runtime = Runtime.getRuntime();
    }
}
