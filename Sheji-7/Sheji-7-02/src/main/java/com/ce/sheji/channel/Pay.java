package com.ce.sheji.channel;

import com.ce.sheji.mode.IPayMode;
import lombok.extern.slf4j.Slf4j;

import java.math.BigDecimal;

/**
 * 支付类型桥接抽象类
 *
 * @author cije
 * @date 2021/11/10 15:22
 */
@Slf4j
public abstract class Pay {

    protected IPayMode payMode;

    public Pay(IPayMode payMode) {
        this.payMode = payMode;
    }

    public abstract String transfer(String uId, String tradeId, BigDecimal amount);
}
