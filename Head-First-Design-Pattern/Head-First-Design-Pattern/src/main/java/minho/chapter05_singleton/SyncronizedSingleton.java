package minho.chapter05_singleton;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class SyncronizedSingleton {
    private static SyncronizedSingleton syncronizedSingleton;

    public static synchronized SyncronizedSingleton getInstance(){
        if(syncronizedSingleton == null){
            syncronizedSingleton = new SyncronizedSingleton();
        }
        return syncronizedSingleton;
    }

    // ...
}
