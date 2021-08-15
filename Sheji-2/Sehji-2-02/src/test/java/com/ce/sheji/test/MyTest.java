package com.ce.sheji.test;

import com.ce.sheji.CacheService;
import com.ce.sheji.cuisine.CacheServiceImpl;
import com.ce.sheji.factory.JDKProxy;
import com.ce.sheji.factory.impl.EGMCacheAdapter;
import com.ce.sheji.factory.impl.IIRCacheAdapter;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

/**
 * @author c__e
 * @date 2021/8/15 15:43
 */
@Slf4j
public class MyTest {

    @Test
    public void testCacheService() throws Exception {
        CacheService proxy_EGM = JDKProxy.getProxy(CacheServiceImpl.class, new EGMCacheAdapter());
        proxy_EGM.set("user_name_01", "小傅哥");
        String val01 = proxy_EGM.get("user_name_01");
        System.out.println(val01);

        CacheService proxy_IIR = JDKProxy.getProxy(CacheServiceImpl.class, new IIRCacheAdapter());
        proxy_IIR.set("user_name_01", "小傅哥");
        String val02 = proxy_IIR.get("user_name_01");
        System.out.println(val02);
    }
}
