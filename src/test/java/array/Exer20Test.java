package array;

import basic.Exer20;
import org.junit.Assert;
import org.junit.Test;

public class Exer20Test {

    @Test
    public void test_isHappyNumber() {
        Assert.assertEquals(new Exer20().isHappyNumber(19), true);
        Assert.assertEquals(new Exer20().isHappyNumber(0), false);
        Assert.assertEquals(new Exer20().isHappyNumber(139), true);
        Assert.assertEquals(new Exer20().isHappyNumber(140), false);
    }
}
