package com.ce.sheji.singleton;

/**
 * 懒汉模式（线程安全）
 *
 * @author c__e
 * @date 2021/8/13 14:11
 */
public class Singleton_02 {

    private Singleton_02() {
    }

    private static Singleton_02 instance;

    public static synchronized Singleton_02 getInstance() {
        if (null != instance) {
            return instance;
        }
        instance = new Singleton_02();
        return instance;
    }
}
