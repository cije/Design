package com.ce.sheji.singleton;

/**
 * @author c__e
 * @date 2021/8/13 14:30
 */
public enum Singleton_07 {
    /**
     * 枚举单例
     */
    INSTANCE;

    public void test() {
        System.out.println(this.getClass() + " test");
    }
}
