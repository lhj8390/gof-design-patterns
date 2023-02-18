package com.lhj8390.creational.singleton.threadSafeSingleton;

/**
 * 스레드가 서로 다른 객체의 참조를 가지는 상황에서
 * 한번에 하나의 스레드만 접근할 수 있도록 동기화
 */
public class ThreadSafeSingleton {
    private static ThreadSafeSingleton INSTANCE;

    public static synchronized ThreadSafeSingleton getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new ThreadSafeSingleton();
        }
        return INSTANCE;
    }
}
