package com.ce.sheji.impl;

import com.ce.sheji.OrderAdapterService;
import com.ce.sheji.service.OrderService;

/**
 * @author c__e
 * @date 2021/8/26 14:14
 */
public class InsideOrderServiceImpl implements OrderAdapterService {
    private OrderService orderService = new OrderService();

    @Override
    public boolean isFirst(String uId) {
        return orderService.queryUserOrderCount(uId) <= 1;
    }
}
