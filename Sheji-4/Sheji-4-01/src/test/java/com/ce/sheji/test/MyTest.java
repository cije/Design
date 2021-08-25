package com.ce.sheji.test;

import com.ce.sheji.QuestionBankController;
import org.junit.jupiter.api.Test;

/**
 * @author c__e
 * @date 2021/8/25 16:35
 */
public class MyTest {
    @Test
    public void testQuestion() {
        QuestionBankController questionBankController = new QuestionBankController();
        System.out.println(questionBankController.createPaper("花", "1000001921030"));
        System.out.println(questionBankController.createPaper("草", "1000001921031"));
        System.out.println(questionBankController.createPaper("灵", "1000001921032"));
    }
}
