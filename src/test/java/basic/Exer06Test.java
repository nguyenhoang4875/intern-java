package basic;

import org.junit.Assert;
import org.junit.Test;

public class Exer06Test {

    @Test
    public void test_sumSequenceOfNumber() {
        Assert.assertEquals(new Exer06().sumSequenceOfNumbers(0), 0);
        Assert.assertEquals(new Exer06().sumSequenceOfNumbers(1), 2);
        Assert.assertEquals(new Exer06().sumSequenceOfNumbers(2), 8);
    }
}
