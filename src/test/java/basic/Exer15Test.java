package basic;

import org.junit.Assert;
import org.junit.Test;

public class Exer15Test {

    @Test
    public void test_reverseBits() {
        Assert.assertEquals(new Exer15().reverseBits(23), 29);
        Assert.assertEquals(new Exer15().reverseBits(0), 0);
        Assert.assertEquals(new Exer15().reverseBits(127), 127);
    }
}
