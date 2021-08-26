package com.ce.sheji;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

/**
 * 统一的MQ消息体
 * @author c__e
 * @date 2021/8/26 11:12
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class RebateInfo {
    /**
     * 用户ID
     */
    private String userId;
    /**
     * 业务ID
     */
    private String bizId;
    /**
     * 业务时间
     */
    private LocalDateTime bizTime;
    /**
     * 业务描述
     */
    private String desc;
}
