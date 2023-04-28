package minho.chapter05_singleton;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class DCLSingleton {
    private volatile static DCLSingleton dclSingleton;

    private static DCLSingleton getInstance(){
        if(dclSingleton == null){
            synchronized (DCLSingleton.class) {
                if(dclSingleton == null) {
                    dclSingleton = new DCLSingleton();
                }
            }
        }
        return dclSingleton;
    }
}
