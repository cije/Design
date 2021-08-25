package com.ce.sheji.test;

import com.ce.sheji.QuestionBankController;
import org.junit.jupiter.api.Test;

/**
 * @author c__e
 * @date 2021/8/25 16:56
 */
public class MyTest {
    @Test
    public void testQuestion() throws CloneNotSupportedException {
        QuestionBankController questionBankController=new QuestionBankController();
        System.out.println(questionBankController.createPaper("山", "10010"));
        System.out.println(questionBankController.createPaper("木", "10011"));
        System.out.println(questionBankController.createPaper("水", "10012"));
    }
}
