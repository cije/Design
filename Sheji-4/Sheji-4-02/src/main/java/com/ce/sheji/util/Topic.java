package com.ce.sheji.util;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Map;

/**
 * @author c__e
 * @date 2021/8/25 16:42
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Topic {
    /**
     * 选项；A、B、C、D
     */
    private Map<String, String> option;
    /**
     * 答案；B
     */
    private String key;

}
