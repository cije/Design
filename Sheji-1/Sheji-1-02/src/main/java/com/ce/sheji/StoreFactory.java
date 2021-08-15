package com.ce.sheji;

import com.ce.sheji.store.ICommodity;
import com.ce.sheji.store.impl.CardCommodityImpl;
import com.ce.sheji.store.impl.CouponCommodityImpl;
import com.ce.sheji.store.impl.GoodsCommodityImpl;
import lombok.Getter;

/**
 * @author c__e
 * @date 2021/8/13 16:26
 */
@Getter
public enum StoreFactory {
    /**
     * 卡片服务
     */
    CARD_SERVICE(new CardCommodityImpl()),
    GOODS_SERVICE(new GoodsCommodityImpl()),
    COUPON_SERVICE(new CouponCommodityImpl());

    private ICommodity iCommodity;

    StoreFactory(ICommodity iCommodity) {
        this.iCommodity = iCommodity;
    }
}
