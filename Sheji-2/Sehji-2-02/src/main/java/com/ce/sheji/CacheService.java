package com.ce.sheji;

import java.util.concurrent.TimeUnit;

/**
 * @author c__e
 * @date 2021/8/15 15:47
 */
public interface CacheService {
    String get(final String key);

    void set(String key, String value);

    void set(String key, String value, long timeout, TimeUnit timeUnit);

    void del(String key);
}
