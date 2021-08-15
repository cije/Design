package com.ce.sheji.test;

import com.ce.sheji.StoreFactory;
import com.ce.sheji.store.ICommodity;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

/**
 * @author c__e
 * @date 2021/8/13 16:43
 */
@Slf4j
public class MyTest {

    @Test
    public void test_commodity() throws Exception {
        // 1. 优惠券
        ICommodity commodityService_1 = StoreFactory.COUPON_SERVICE.getICommodity();
        commodityService_1.sendCommodity("10001", "EGM1023938910232121323432", "791098764902132", null);

        // 2. 实物商品
        ICommodity commodityService_2 = StoreFactory.GOODS_SERVICE.getICommodity();
        Map<String, String> extMap = new HashMap<String, String>() {{
            put("consigneeUserName", "谢飞机");
            put("consigneeUserPhone", "15200292123");
            put("consigneeUserAddress", "吉林省.长春市.双阳区.XX街道.檀溪苑小区.#18-2109");
        }};
        commodityService_2.sendCommodity("10001", "9820198721311", "1023000020112221113", extMap);

        // 3. 第三方兑换卡(爱奇艺)
        ICommodity commodityService_3 = StoreFactory.CARD_SERVICE.getICommodity();
        commodityService_3.sendCommodity("10001", "AQY1xjkUodl8LO975GdfrYUio", "00001", null);
    }
}
