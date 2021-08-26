package com.ce.sheji;

import com.alibaba.fastjson.JSON;
import com.ce.sheji.mq.POPOrderDelivered;
import lombok.extern.slf4j.Slf4j;

/**
 * @author c__e
 * @date 2021/8/26 11:01
 */
@Slf4j
public class POPOrderMqService {
    public void onMessage(String message) {
        POPOrderDelivered mq = JSON.parseObject(message, POPOrderDelivered.class);
        log.info("POPOrderDelivered: {} ", mq.toString());

        // ... 处理自己的业务
    }
}
