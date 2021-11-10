package com.ce.sheji.mode;

import lombok.extern.slf4j.Slf4j;

/**
 * 指纹支付
 *
 * @author cije
 * @date 2021/11/10 15:35
 */
@Slf4j
public class PayFingerprintMode implements IPayMode {
    @Override
    public boolean security(String uId) {
        log.info("指纹支付，风控校验指纹信息");
        return true;
    }
}
