package com.ce.sheji.goods;

import lombok.Data;

/**
 * @author c__e
 * @date 2021/8/13 15:39
 */
@Data
public class DeliverReq {
    /**
     * 用户姓名
     */
    private String userName;
    /**
     * 用户手机
     */
    private String userPhone;
    /**
     * 商品SKU
     */
    private String sku;
    /**
     * 订单ID
     */
    private String orderId;
    /**
     * 收货人姓名
     */
    private String consigneeUserName;
    /**
     * 收货人手机
     */
    private String consigneeUserPhone;
    /**
     * 收获人地址
     */
    private String consigneeUserAddress;
}
