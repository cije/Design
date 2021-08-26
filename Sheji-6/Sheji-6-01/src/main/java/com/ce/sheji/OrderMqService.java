package com.ce.sheji;

import com.alibaba.fastjson.JSON;
import com.ce.sheji.mq.OrderMq;
import lombok.extern.slf4j.Slf4j;

/**
 * @author c__e
 * @date 2021/8/26 11:00
 */
@Slf4j
public class OrderMqService {

    public void onMessage(String message) {
        OrderMq mq = JSON.parseObject(message, OrderMq.class);
        log.info("orderMq: {}", mq.toString());

        // ... 处理自己的业务
    }
}
