package com.ce.sheji.factory.impl;

import com.ce.sheji.factory.ICacheAdapter;
import com.ce.sheji.matter.EGM;

import java.util.concurrent.TimeUnit;

/**
 * @author c__e
 * @date 2021/8/15 15:35
 */
public class EGMCacheAdapter implements ICacheAdapter {

    private EGM egm = new EGM();

    @Override
    public String get(String key) {
        return egm.gain(key);
    }

    @Override
    public void set(String key, String value) {
        egm.set(key, value);
    }

    @Override
    public void set(String key, String value, long timeout, TimeUnit timeUnit) {
        egm.setEx(key, value, timeout, timeUnit);
    }

    @Override
    public void del(String key) {
        egm.delete(key);
    }
}
