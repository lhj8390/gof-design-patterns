package com.lhj8390.creational.singleton.lazySingleton;

/**
 * 지연 초기화 방식
 */
public class LazySingleton {
    private static LazySingleton INSTANCE;

    public static LazySingleton getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new LazySingleton();
        }
        return INSTANCE;
    }

}
