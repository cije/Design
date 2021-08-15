package com.ce.sheji.singleton;

/**
 * 饿汉模式（线程安全）
 *
 * @author c__e
 * @date 2021/8/13 14:13
 */
public class Singleton_03 {

    private Singleton_03() {
    }

    private static final Singleton_03 instance = new Singleton_03();

    public static Singleton_03 getInstance() {
        return instance;
    }
}
