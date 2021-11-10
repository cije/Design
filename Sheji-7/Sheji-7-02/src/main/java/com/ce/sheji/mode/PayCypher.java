package com.ce.sheji.mode;

import lombok.extern.slf4j.Slf4j;

/**
 * 密码支付
 *
 * @author cije
 * @date 2021/11/10 15:33
 */
@Slf4j
public class PayCypher implements IPayMode {
    @Override
    public boolean security(String uId) {
        log.info("密码支付，风控校验环境安全");
        return true;
    }
}
