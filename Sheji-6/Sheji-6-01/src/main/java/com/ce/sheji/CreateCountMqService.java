package com.ce.sheji;

import com.alibaba.fastjson.JSON;
import com.ce.sheji.mq.CreateCount;
import lombok.extern.slf4j.Slf4j;

/**
 * @author c__e
 * @date 2021/8/26 11:00
 */
@Slf4j
public class CreateCountMqService {
    public void onMessage(String message) {
        CreateCount mq = JSON.parseObject(message, CreateCount.class);
        log.info("createCountMq: {} ", mq.toString());

        // ... 处理自己的业务
    }
}
