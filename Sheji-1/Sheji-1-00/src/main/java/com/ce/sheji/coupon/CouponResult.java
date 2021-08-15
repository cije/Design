package com.ce.sheji.coupon;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author c__e
 * @date 2021/8/13 15:42
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CouponResult {
    /**
     * 编码
     */
    private String code;
    /**
     * 描述
     */
    private String info;

    public static CouponResult succ() {
        return new CouponResult("0000", "发放成功");
    }
}
