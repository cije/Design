package com.ce.sheji;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 问答题
 * @author c__e
 * @date 2021/8/25 16:25
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class AnswerQuestion {
    /**
     * 问题
     */
    private String name;
    /**
     * 答案
     */
    private String key;

}
