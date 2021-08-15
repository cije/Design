package com.ce.sheji.singleton;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * 静态类使用
 *
 * @author c__e
 * @date 2021/8/13 14:06
 */
public class Singleton_00 {

    private static Map<String, String> cache = new ConcurrentHashMap<>();
}
