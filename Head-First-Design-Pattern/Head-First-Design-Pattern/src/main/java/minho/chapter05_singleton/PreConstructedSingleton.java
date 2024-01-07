package minho.chapter05_singleton;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class PreConstructedSingleton {
    private static PreConstructedSingleton preConstructedSingleton = new PreConstructedSingleton();

    public static PreConstructedSingleton getInstance() {
        return preConstructedSingleton;
    }

    // ...
}
