package com.ce.sheji.singleton;

/**
 * 使用类的内部类(线程安全)
 * 懒加载
 *
 * @author c__e
 * @date 2021/8/13 14:15
 */
public class Singleton_04 {

    private static class SingletonHolder {
        private static final Singleton_04 instance = new Singleton_04();
    }

    private Singleton_04() {
    }

    public static Singleton_04 getInstance() {
        return SingletonHolder.instance;
    }
}
