package com.ce.sheji.test;

import com.alibaba.fastjson.JSON;
import com.ce.sheji.MQAdapter;
import com.ce.sheji.OrderAdapterService;
import com.ce.sheji.RebateInfo;
import com.ce.sheji.impl.InsideOrderServiceImpl;
import com.ce.sheji.impl.POPOrderServiceImpl;
import com.ce.sheji.mq.CreateCount;
import com.ce.sheji.mq.OrderMq;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

import java.lang.reflect.InvocationTargetException;
import java.time.LocalDateTime;
import java.util.HashMap;

/**
 * @author c__e
 * @date 2021/8/26 11:18
 */
@Slf4j
public class MyTest {

    @Test
    public void testMqAdapter() throws InvocationTargetException, NoSuchMethodException, IllegalAccessException {
        CreateCount createCount = new CreateCount();
        createCount.setNumber("100001");
        createCount.setAddress("河北省.廊坊市.广阳区.大学里职业技术学院");
        createCount.setAccountDate(LocalDateTime.now());
        createCount.setDesc("在校开户");
        String createCountJson = JSON.toJSONString(createCount);

        HashMap<String, String> link01 = new HashMap<>();
        link01.put("userId", "number");
        link01.put("bizId", "number");
        link01.put("bizTime", "accountDate");
        link01.put("desc", "desc");
        RebateInfo rebateInfo01 = MQAdapter.filter(createCountJson, link01);
        System.out.println("mq.create_account(适配前)" + createCountJson);
        System.out.println("mq.create_account(适配后)" + JSON.toJSONString(rebateInfo01));

        System.out.println();

        OrderMq orderMq = new OrderMq();
        orderMq.setUid("100001");
        orderMq.setSku("10928092093111123");
        orderMq.setOrderId("100000890193847111");
        orderMq.setCreateOrderTime(LocalDateTime.now());
        String orderMqJson = JSON.toJSONString(orderMq);

        HashMap<String, String> link02 = new HashMap<>();
        link02.put("userId", "uid");
        link02.put("bizId", "orderId");
        link02.put("bizTime", "createOrderTime");
        RebateInfo rebateInfo02 = MQAdapter.filter(orderMqJson, link02);

        System.out.println("mq.orderMq(适配前)" + orderMqJson);
        System.out.println("mq.orderMq(适配后)" + JSON.toJSONString(rebateInfo02));
    }

    @Test
    public void testFirst() {
        OrderAdapterService popOrderAdapterService = new POPOrderServiceImpl();
        System.out.println("判断首单，接口适配(POP)：" + popOrderAdapterService.isFirst("100001"));

        OrderAdapterService insideOrderService = new InsideOrderServiceImpl();
        System.out.println("判断首单，接口适配(自营)：" + insideOrderService.isFirst("100001"));
    }
}
