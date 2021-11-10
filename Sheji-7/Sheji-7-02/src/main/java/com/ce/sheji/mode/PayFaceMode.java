package com.ce.sheji.mode;

import lombok.extern.slf4j.Slf4j;

/**
 * 人脸支付
 *
 * @author cije
 * @date 2021/11/10 15:32
 */
@Slf4j
public class PayFaceMode implements IPayMode {
    @Override
    public boolean security(String uId) {
        log.info("人脸支付，风控校验脸部识别");
        return true;
    }
}
