package com.ce.sheji.singleton;

/**
 * 懒汉模式（线程不安全）
 *
 * @author c__e
 * @date 2021/8/13 14:05
 */
public class Singleton_01 {
    private Singleton_01() {
    }

    private static Singleton_01 instance;

    public static Singleton_01 getInstance() {
        if (null != instance) {
            return instance;
        }
        instance = new Singleton_01();
        return instance;
    }
}
