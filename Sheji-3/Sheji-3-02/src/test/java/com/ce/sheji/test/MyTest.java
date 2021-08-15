package com.ce.sheji.test;

import com.ce.sheji.Builder;
import org.junit.jupiter.api.Test;

/**
 * @author c__e
 * @date 2021/8/15 17:34
 */
public class MyTest {
    @Test
    public void test_Builder() {
        Builder builder = new Builder();
        // 豪华欧式
        System.out.println(builder.levelOne(132.52D).getDetail());
        // 轻奢田园
        System.out.println(builder.levelTwo(98.25D).getDetail());
        // 现代简约
        System.out.println(builder.levelThree(85.43D).getDetail());
    }
}
