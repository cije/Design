package com.ce.sheji.impl;

import com.ce.sheji.OrderAdapterService;
import com.ce.sheji.service.POPOrderService;

/**
 * @author c__e
 * @date 2021/8/26 14:19
 */
public class POPOrderServiceImpl implements OrderAdapterService {
    private POPOrderService popOrderService = new POPOrderService();

    @Override
    public boolean isFirst(String uId) {
        return popOrderService.isFirstOrder(uId);
    }
}
