package com.ce.sheji.mq;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

/**
 * 开户
 * @author c__e
 * @date 2021/8/26 10:51
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateCount {
    /**
     * 开户编号
     */
    private String number;
    /**
     * 开户地
     */
    private String address;
    /**
     * 开户时间
     */
    private LocalDateTime accountDate;
    /**
     * 开户描述
     */
    private String desc;
}
