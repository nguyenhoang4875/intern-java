package basic;

import org.junit.Assert;
import org.junit.Test;

public class Exer16Test {

    @Test
    public void test_countQuantityPrimesNotGreater() {
        Assert.assertEquals(new Exer16().countQuantityPrimesNotGreater(0), 0);
        Assert.assertEquals(new Exer16().countQuantityPrimesNotGreater(1), 2);
        Assert.assertEquals(new Exer16().countQuantityPrimesNotGreater(8), 6);
    }
}
