package jihong.chapter05_Sigleton;

public class _4DCLSingleton {

    private static _4DCLSingleton uniqueInstance;

    private _4DCLSingleton() {}

    /**
     * Double-Checked Locking
     * - 인스턴스가 생성됭어있는 지 확인 후, 생성되지 않을 시에만 동기화
     * - 자바 1.4 버전 이하에서는 사용 불가능
     * @return
     */
    public static synchronized _4DCLSingleton getInstance() {
        if (uniqueInstance == null) {
            synchronized (_4DCLSingleton.class) {
                if (uniqueInstance == null) {
                    uniqueInstance = new _4DCLSingleton();
                }
            }
        }
        return uniqueInstance;
    }

    // 기타 코드..
}
