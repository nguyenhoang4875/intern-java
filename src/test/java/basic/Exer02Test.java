package basic;

import org.junit.Assert;
import org.junit.Test;

public class Exer02Test {

    @Test
    public void test_findSumAllDigit() {
        Assert.assertEquals(new Exer02().findSumAllDigit(1234), 10);
        Assert.assertEquals(new Exer02().findSumAllDigit(0), 0);
        Assert.assertEquals(new Exer02().findSumAllDigit(99), 18);
    }
}
