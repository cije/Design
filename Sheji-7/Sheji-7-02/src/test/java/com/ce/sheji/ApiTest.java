package com.ce.sheji;

import com.ce.sheji.channel.Pay;
import com.ce.sheji.channel.WxPay;
import com.ce.sheji.channel.ZfbPay;
import com.ce.sheji.mode.PayFaceMode;
import com.ce.sheji.mode.PayFingerprintMode;
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
        System.out.println("\r\n模拟测试场景；微信支付、人脸方式。");
        Pay wxPay = new WxPay(new PayFaceMode());
        wxPay.transfer("weixin_1092033111", "100000109893", new BigDecimal(100));

        System.out.println("\r\n模拟测试场景；支付宝支付、指纹方式。");
        Pay zfbPay = new ZfbPay(new PayFingerprintMode());
        zfbPay.transfer("jlu19dlxo111", "100000109894", new BigDecimal(100));
    }
}
