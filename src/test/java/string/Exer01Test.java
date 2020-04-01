package string;

import org.junit.Assert;
import org.junit.Test;

public class Exer01Test {

    @Test
    public void test_slipWithCondition() {
        Assert.assertArrayEquals(new Exer01().slipWithCondition("Fist sentence.What is content of second sentence?Third sentence amazing!Fourth sentence\nFifth Sentence"),
                new String[]{"Fist sentence", "What is content of second sentence", "Third sentence amazing", "Fourth sentence", "Fifth Sentence"}
        );
    }
}
