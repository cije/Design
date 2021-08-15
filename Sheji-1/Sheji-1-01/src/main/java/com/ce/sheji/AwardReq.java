package com.ce.sheji;

import lombok.Data;

import java.util.Map;

/**
 * @author c__e
 * @date 2021/8/13 15:47
 */
@Data
public class AwardReq {
    /**
     * 用户唯一ID
     */
    private String uId;
    /**
     * 奖品类型(可以用枚举定义)；1优惠券、2实物商品、3第三方兑换卡(爱奇艺)
     */
    private Integer awardType;
    /**
     * 奖品编号；sku、couponNumber、cardId
     */
    private String awardNumber;
    /**
     * 业务ID，防重复
     */
    private String bizId;
    /**
     * 扩展信息
     */
    private Map<String, String> extMap;
}
