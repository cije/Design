package com.ce.sheji.singleton;

/**
 * 双重锁校验(线程安全)
 * <p/>
 * 双重锁的方式是方法级锁的优化，减少了部分获取实例的耗时。
 * 同时这种方式也满足了懒加载。
 *
 * @author c__e
 * @date 2021/8/13 14:18
 */
public class Singleton_05 {

    private Singleton_05() {
    }

    private static volatile Singleton_05 instance;

    public static Singleton_05 getInstance() {
        if (null != instance) {
            return instance;
        }
        synchronized (Singleton_05.class) {
            if (null == instance) {
                instance = new Singleton_05();
            }
        }
        return instance;
    }
}
