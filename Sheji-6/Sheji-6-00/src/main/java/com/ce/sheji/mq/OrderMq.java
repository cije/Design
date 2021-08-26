package com.ce.sheji.mq;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

/**
 * @author c__e
 * @date 2021/8/26 10:53
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class OrderMq {
    /**
     * 用户ID
     */
    private String uid;
    /**
     * 商品
     */
    private String sku;
    /**
     * 订单ID
     */
    private String orderId;
    /**
     * 订单时间
     */
    private LocalDateTime createOrderTime;
}
