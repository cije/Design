package com.ce.sheji.test;

import com.ce.sheji.CacheService;
import com.ce.sheji.cuisine.impl.CacheServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

/**
 * @author c__e
 * @date 2021/8/15 15:26
 */
@Slf4j
public class MyTest {

    @Test
    public void testCacheService() {
        CacheService cacheService = new CacheServiceImpl();
        cacheService.set("user_name_01", "小傅哥", 1);
        String val01 = cacheService.get("user_name_01", 1);
        System.out.println(val01);
    }
}
