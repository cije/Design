package com.ce.sheji;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author c__e
 * @date 2021/8/13 15:47
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class AwardRes {
    /**
     * 编码
     */
    private String code;
    /**
     * 描述
     */
    private String info;
}
