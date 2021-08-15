package com.ce.sheji.store.impl;

import com.alibaba.fastjson.JSON;
import com.ce.sheji.card.IQiYiCardService;
import com.ce.sheji.store.ICommodity;
import lombok.extern.slf4j.Slf4j;

import java.util.Map;

/**
 * 爱奇艺卡片发奖实现类
 *
 * @author c__e
 * @date 2021/8/13 16:35
 */
@Slf4j
public class CardCommodityImpl implements ICommodity {

    private IQiYiCardService cardService = new IQiYiCardService();

    @Override
    public void sendCommodity(String uId, String commodityId, String bizId, Map<String, String> extMap) throws Exception {
        String mobile = queryUserMobile(uId);
        cardService.grantToken(mobile, bizId);
        log.info("请求参数[爱奇艺兑换卡] => uId：{} commodityId：{} bizId：{} extMap：{}", uId, commodityId, bizId, JSON.toJSON(extMap));
        log.info("测试结果[爱奇艺兑换卡]：success");
    }

    private String queryUserMobile(String uId) {
        return "15200101232";
    }
}
