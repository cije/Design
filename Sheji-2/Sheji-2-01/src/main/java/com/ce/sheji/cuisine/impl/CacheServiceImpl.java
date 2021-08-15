package com.ce.sheji.cuisine.impl;

import com.ce.sheji.CacheService;
import com.ce.sheji.RedisUtil;
import com.ce.sheji.matter.EGM;
import com.ce.sheji.matter.IIR;

import java.util.concurrent.TimeUnit;

/**
 * @author c__e
 * @date 2021/8/15 15:20
 */
public class CacheServiceImpl implements CacheService {
    private RedisUtil redisUtil = new RedisUtil();
    private EGM egm = new EGM();
    private IIR iir = new IIR();


    @Override
    public String get(String key, int redisType) {
        if (1 == redisType) {
            return egm.gain(key);
        } else if (2 == redisType) {
            return iir.get(key);
        }
        return redisUtil.get(key);
    }

    @Override
    public void set(String key, String value, int redisType) {
        if (1 == redisType) {
            egm.set(key, value);
        } else if (2 == redisType) {
            iir.set(key, value);
        }
        redisUtil.set(key, value);
    }

    @Override
    public void set(String key, String value, long timeout, TimeUnit timeUnit, int redisType) {
        if (1 == redisType) {
            egm.setEx(key, value, timeout, timeUnit);
        } else if (2 == redisType) {
            iir.setExpire(key, value, timeout, timeUnit);
        }
        redisUtil.set(key, value, timeout, timeUnit);
    }

    @Override
    public void del(String key, int redisType) {
        if (1 == redisType) {
            egm.delete(key);
        } else if (2 == redisType) {
            iir.del(key);
        }
        redisUtil.del(key);
    }
}
