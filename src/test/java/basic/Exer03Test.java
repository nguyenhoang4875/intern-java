package basic;

import org.junit.Assert;
import org.junit.Test;

public class Exer03Test {

    @Test
    public void test_calMultiNumPrimes() {
        Assert.assertEquals(new Exer03().calMultiNumPrimes(1), "");
        Assert.assertEquals(new Exer03().calMultiNumPrimes(2), "2");
        Assert.assertEquals(new Exer03().calMultiNumPrimes(5), "5");
        Assert.assertEquals(new Exer03().calMultiNumPrimes(600), "2*2*2*3*5*5");
        Assert.assertEquals(new Exer03().calMultiNumPrimes(900), "2*2*3*3*5*5");
    }
}
