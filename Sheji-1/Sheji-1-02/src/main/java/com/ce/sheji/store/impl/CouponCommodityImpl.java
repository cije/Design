package com.ce.sheji.store.impl;

import com.alibaba.fastjson.JSON;
import com.ce.sheji.coupon.CouponResult;
import com.ce.sheji.coupon.CouponService;
import com.ce.sheji.store.ICommodity;
import lombok.extern.slf4j.Slf4j;

import java.util.Map;

/**
 * 优惠券发奖实现类
 *
 * @author c__e
 * @date 2021/8/13 16:30
 */
@Slf4j
public class CouponCommodityImpl implements ICommodity {

    private CouponService couponService = new CouponService();

    @Override
    public void sendCommodity(String uId, String commodityId, String bizId, Map<String, String> extMap) throws Exception {
        CouponResult couponResult = couponService.sendCoupon(uId, commodityId, bizId);
        log.info("请求参数[优惠券] => uId：{} commodityId：{} bizId：{} extMap：{}", uId, commodityId, bizId, JSON.toJSON(extMap));
        log.info("测试结果[优惠券]：{}", JSON.toJSON(couponResult));
        if (!"0000".equals(couponResult.getCode())) {
            throw new RuntimeException(couponResult.getInfo());
        }
    }
}
