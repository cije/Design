package com.ce.sheji.coupon;

/**
 * 模拟优惠券服务
 *
 * @author c__e
 * @date 2021/8/13 15:42
 */
public class CouponService {

    public CouponResult sendCoupon(String uId, String couponNumber, String uuid) {
        System.out.println("模拟发放优惠券一张：" + uId + "," + couponNumber + "," + uuid);
        return CouponResult.succ();
    }
}
