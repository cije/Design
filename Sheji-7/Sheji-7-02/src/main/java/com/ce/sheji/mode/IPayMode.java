package com.ce.sheji.mode;

/**
 * 支付模式接口
 *
 * @author cije
 * @date 2021/11/10 15:22
 */
public interface IPayMode {
    boolean security(String uId);
}
