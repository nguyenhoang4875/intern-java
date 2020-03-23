package basic;

import org.junit.Assert;
import org.junit.Test;

public class Exer04Test {

    @Test
    public void test_findAllPrimesNotGreater() {
        Assert.assertEquals(new Exer04().findAllPrimesNotGreater(0), "");
        Assert.assertEquals(new Exer04().findAllPrimesNotGreater(1), "1 1");
        Assert.assertEquals(new Exer04().findAllPrimesNotGreater(8), "1 1 2 3 5 8");
    }
}
