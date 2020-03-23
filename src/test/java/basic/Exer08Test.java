package basic;

import org.junit.Assert;
import org.junit.Test;

public class Exer08Test {

    @Test
    public void test_calPi() {
        Assert.assertEquals(new Exer08().calPi(0.0001), Math.PI, 0.0001);
    }
}
