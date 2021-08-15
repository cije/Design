package com.ce.sheji.cuisine;

import com.ce.sheji.CacheService;
import com.ce.sheji.RedisUtil;

import java.util.concurrent.TimeUnit;

/**
 * @author c__e
 * @date 2021/8/15 15:16
 */
public class CacheServiceImpl implements CacheService {
    private RedisUtil redisUtil = new RedisUtil();

    @Override
    public String get(String key) {
        return redisUtil.get(key);
    }

    @Override
    public void set(String key, String value) {
        redisUtil.set(key, value);
    }

    @Override
    public void set(String key, String value, long timeout, TimeUnit timeUnit) {
        redisUtil.set(key, value, timeout, timeUnit);
    }

    @Override
    public void del(String key) {
        redisUtil.del(key);
    }
}
