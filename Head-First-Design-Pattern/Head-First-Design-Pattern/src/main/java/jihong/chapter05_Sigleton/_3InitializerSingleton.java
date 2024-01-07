package jihong.chapter05_Sigleton;

public class _3InitializerSingleton {

    private static _3InitializerSingleton uniqueInstance = new _3InitializerSingleton();

    private _3InitializerSingleton() {}

    /**
     * 정적 초기화
     * - 인스턴스를 처음부터 생성
     * - 사용하지 않는 경우에 불필요한 메모리 차지
     * @return
     */
    public static synchronized _3InitializerSingleton getInstance() {
        return uniqueInstance;
    }

    // 기타 코드..
}
