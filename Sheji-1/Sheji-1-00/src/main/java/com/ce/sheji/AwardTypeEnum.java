package com.ce.sheji;

import lombok.Getter;

/**
 * 奖品类型枚举
 *
 * @author c__e
 * @date 2021/8/13 15:55
 */
@Getter
public enum AwardTypeEnum {
    /**
     * 1优惠券
     */
    COUPON(1),
    /**
     * 2实物商品
     */
    GOODS(2),
    /**
     * 3第三方兑换卡(爱奇艺)
     */
    CARD(3);

    private final Integer awardType;

    AwardTypeEnum(Integer awardType) {
        this.awardType = awardType;
    }

}
