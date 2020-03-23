package basic;

import org.junit.Assert;
import org.junit.Test;

public class Exer09Test {

    @Test
    public void test_calPi() {
        Assert.assertEquals(new Exer09().calPi(0.0001), Math.PI, 0.0001);
    }
}
