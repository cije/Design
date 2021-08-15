package com.ce.sheji.factory;

import java.util.concurrent.TimeUnit;

/**
 * @author c__e
 * @date 2021/8/15 15:34
 */
public interface ICacheAdapter {
    String get(String key);

    void set(String key, String value);

    void set(String key, String value, long timeout, TimeUnit timeUnit);

    void del(String key);

}
