package com.ce.sheji.goods;

import com.alibaba.fastjson.JSON;

/**
 * 模拟实物商品服务
 *
 * @author c__e
 * @date 2021/8/13 15:40
 */
public class GoodsService {

    public Boolean deliverGoods(DeliverReq req) {
        System.out.println("模拟发货实物商品一个：" + JSON.toJSONString(req));
        return true;
    }
}
