package jihong.chapter05_Sigleton;

public class _2Singleton {
    private boolean empty;
    private boolean boiled;

    private static _2Singleton uniqueInstance;

    private _2Singleton(){
        empty = true;
        boiled = false;
    }

    /**
     * synchronized
     * - getInstance 동기화
     * - 한 스레드가 메소드 사용이 끝내기 전까지 다른 스데르를 기다려야 함
     * - 불필요한 오버헤드 증가
     * - 성능 저하
     * @return
     */
    public static synchronized _2Singleton getInstance(){
        if(uniqueInstance == null){
            uniqueInstance = new _2Singleton();
        }
        return uniqueInstance;
    }


    //기타 코드..
}
