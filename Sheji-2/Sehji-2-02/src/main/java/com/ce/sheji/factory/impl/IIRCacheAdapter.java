package com.ce.sheji.factory.impl;

import com.ce.sheji.factory.ICacheAdapter;
import com.ce.sheji.matter.IIR;

import java.util.concurrent.TimeUnit;

/**
 * @author c__e
 * @date 2021/8/15 15:38
 */
public class IIRCacheAdapter implements ICacheAdapter {

    private IIR iir = new IIR();

    @Override
    public String get(String key) {
        return iir.get(key);
    }

    @Override
    public void set(String key, String value) {
        iir.set(key, value);
    }

    @Override
    public void set(String key, String value, long timeout, TimeUnit timeUnit) {
        iir.setExpire(key, value, timeout, timeUnit);
    }

    @Override
    public void del(String key) {
        iir.del(key);
    }
}
