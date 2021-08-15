package com.ce.sheji.card;

/**
 * 模拟爱奇艺会员卡服务
 *
 * @author c__e
 * @date 2021/8/13 15:37
 */
public class IQiYiCardService {
    
    public void grantToken(String bindMobileNumber, String cardId) {
        System.out.println("模拟发放爱奇艺会员卡一张：" + bindMobileNumber + "，" + cardId);
    }
}
