package jihong.chapter05_Sigleton;

public class _1LittleSingleton {
    private boolean empty;
    private boolean boiled;

    private static _1LittleSingleton uniqueInstance;

    private _1LittleSingleton(){
        empty = true;
        boiled = false;
    }

    /**
     * Lazy Instantiation
     * - 멀티스레딩 문제 발생
     * @return
     */
    public static _1LittleSingleton getInstance(){
        if(uniqueInstance == null){
            uniqueInstance = new _1LittleSingleton();
        }
        return uniqueInstance;
    }

    //기타 코드..
}
