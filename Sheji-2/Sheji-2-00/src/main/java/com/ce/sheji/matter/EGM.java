package com.ce.sheji.matter;

import lombok.extern.slf4j.Slf4j;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;

/**
 * @author c__e
 * @date 2021/8/15 15:12
 */
@Slf4j
public class EGM {

    private Map<String, String> dataMap = new ConcurrentHashMap<>();

    public String gain(String key) {
        log.info("EGM获取数据 key：{}", key);
        return dataMap.get(key);
    }

    public void set(String key, String value) {
        log.info("EGM写入数据 key：{} val：{}", key, value);
        dataMap.put(key, value);
    }

    public void setEx(String key, String value, long timeout, TimeUnit timeUnit) {
        log.info("EGM写入数据 key：{} val：{} timeout：{} timeUnit：{}", key, value, timeout, timeUnit.toString());
        dataMap.put(key, value);
    }

    public void delete(String key) {
        log.info("EGM删除数据 key：{}", key);
        dataMap.remove(key);
    }
}
