package com.ce.sheji.store;

import java.util.Map;

/**
 * 发奖接口
 *
 * @author c__e
 * @date 2021/8/13 16:26
 */
public interface ICommodity {
    /**
     * 发送奖品
     *
     * @param uId         用户id
     * @param commodityId 奖品id
     * @param bizId       业务id
     * @param extMap      扩展字段
     * @throws Exception 异常
     */
    void sendCommodity(String uId, String commodityId, String bizId, Map<String, String> extMap) throws Exception;
}
