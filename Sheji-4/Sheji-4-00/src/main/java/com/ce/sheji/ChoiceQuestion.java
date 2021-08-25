package com.ce.sheji;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Map;

/**
 * 选择题
 * @author c__e
 * @date 2021/8/25 16:26
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ChoiceQuestion {
    /**
     * 题目
     */
    private String name;
    /**
     * 选项: A、B、C、D
     */
    private Map<String, String> option;
    /**
     * 答案: B
     */
    private String key;
}
