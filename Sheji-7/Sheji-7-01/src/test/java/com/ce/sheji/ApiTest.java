package com.ce.sheji;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

/**
 * @author cije
 * @date 2021/11/10 15:07
 */
@Slf4j
public class ApiTest {

    @Test
    public void testPay() {
        PayController payController = new PayController();
        System.out.println("模拟测试场景：微信支付、人脸方式");
        payController.doPay("weixin_00000001", "100000109893", new BigDecimal("100"), 1, 2);

        System.out.println("模拟测试场景：支付宝支付、人脸方式");
        payController.doPay("jlu19dlxo111", "100000109894", new BigDecimal("100"), 2, 2);
    }
}
