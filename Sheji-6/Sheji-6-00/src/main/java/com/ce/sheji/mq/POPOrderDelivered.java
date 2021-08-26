package com.ce.sheji.mq;

import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * 第三方订单
 * @author c__e
 * @date 2021/8/26 10:54
 */
public class POPOrderDelivered {
    /**
     * 用户ID
     */
    private String uId;
    /**
     * 订单号
     */
    private String orderId;
    /**
     * 下单时间
     */
    private LocalDateTime orderTime;
    /**
     * 商品
     */
    private LocalDateTime sku;
    /**
     * 商品名称
     */
    private LocalDateTime skuName;
    /**
     * 金额
     */
    private BigDecimal decimal;
}
