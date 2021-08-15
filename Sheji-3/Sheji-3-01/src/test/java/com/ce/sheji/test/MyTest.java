package com.ce.sheji.test;

import com.ce.sheji.DecorationPackageController;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

/**
 * @author c__e
 * @date 2021/8/15 16:25
 */
@Slf4j
public class MyTest {
    @Test
    public void test1() {
        DecorationPackageController decoration = new DecorationPackageController();
        // 豪华欧式
        System.out.println(decoration.getMatterList(new BigDecimal("132.52"), 1));
        // 轻奢田园
        System.out.println(decoration.getMatterList(new BigDecimal("98.25"), 2));
        // 现代简约
        System.out.println(decoration.getMatterList(new BigDecimal("85.43"), 3));
    }
}
