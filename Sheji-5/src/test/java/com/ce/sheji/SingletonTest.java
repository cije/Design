package com.ce.sheji;

import com.ce.sheji.singleton.*;
import org.junit.jupiter.api.Test;

/**
 * @author c__e
 * @date 2021/8/13 14:24
 */
public class SingletonTest {

    @Test
    public void test1() {
        Singleton_01 instance01_1 = Singleton_01.getInstance();
        System.out.println(instance01_1);
        Singleton_01 instance01_2 = Singleton_01.getInstance();
        System.out.println(instance01_2);
    }

    @Test
    public void test2() {
        Singleton_02 instance02_1 = Singleton_02.getInstance();
        System.out.println(instance02_1);
        Singleton_02 instance02_2 = Singleton_02.getInstance();
        System.out.println(instance02_2);
    }

    @Test
    public void test3() {
        Singleton_03 instance03_1 = Singleton_03.getInstance();
        System.out.println(instance03_1);
        Singleton_03 instance03_2 = Singleton_03.getInstance();
        System.out.println(instance03_2);
    }

    @Test
    public void test4() {
        Singleton_04 instance04_1 = Singleton_04.getInstance();
        System.out.println(instance04_1);
        Singleton_04 instance04_2 = Singleton_04.getInstance();
        System.out.println(instance04_2);
    }

    @Test
    public void test5() {
        Singleton_05 instance05_1 = Singleton_05.getInstance();
        System.out.println(instance05_1);
        Singleton_05 instance05_2 = Singleton_05.getInstance();
        System.out.println(instance05_2);
    }

    @Test
    public void test6() {
        Singleton_06 instance06_1 = Singleton_06.getInstance();
        System.out.println(instance06_1);
        Singleton_06 instance06_2 = Singleton_06.getInstance();
        System.out.println(instance06_2);
    }

    @Test
    public void test7() {
        Singleton_07.INSTANCE.test();
        Singleton_07 instance = Singleton_07.INSTANCE;
        instance.test();
    }
}
