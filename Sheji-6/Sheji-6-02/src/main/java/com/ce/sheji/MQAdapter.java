package com.ce.sheji;

import com.alibaba.fastjson.JSON;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.time.LocalDateTime;
import java.util.Map;

/**
 * MQ消息体适配类
 * @author c__e
 * @date 2021/8/26 11:16
 */
public class MQAdapter {
    public static RebateInfo filter(String strJson, Map<String, String> link) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        return filter(JSON.parseObject(strJson, Map.class), link);
    }

    public static RebateInfo filter(Map obj, Map<String, String> link) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        RebateInfo rebateInfo = new RebateInfo();
        for (String key : link.keySet()) {
            Object val = obj.get(link.get(key));
            String methodName = "set" + key.substring(0, 1).toUpperCase() + key.substring(1);
            Method[] methods = RebateInfo.class.getMethods();
            for (Method method : methods) {
                if (method.getName().equals(methodName)) {
                    Class<?> clazz = method.getParameterTypes()[0];
                    if (clazz == LocalDateTime.class) {
                        method.invoke(rebateInfo, LocalDateTime.parse(val.toString()));
                    } else {
                        method.invoke(rebateInfo, clazz.cast(val.toString()));
                    }
                    break;
                }
            }
        }
        return rebateInfo;
    }
}
