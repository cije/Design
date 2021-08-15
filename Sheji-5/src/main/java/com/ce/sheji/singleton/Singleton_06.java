package com.ce.sheji.singleton;

import java.util.concurrent.atomic.AtomicReference;

/**
 * CAS「AtomicReference」(线程安全)
 *
 * @author c__e
 * @date 2021/8/13 14:26
 */
public class Singleton_06 {
    private static final AtomicReference<Singleton_06> INSTANCE = new AtomicReference<>();

    private static Singleton_06 instance;

    private Singleton_06() {
    }

    public static final Singleton_06 getInstance() {
        for (; ; ) {
            Singleton_06 instance = INSTANCE.get();
            if (null != instance) {
                return instance;
            }
            INSTANCE.compareAndSet(null, new Singleton_06());
            return INSTANCE.get();
        }
    }
}
