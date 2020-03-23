package basic;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigInteger;

public class Exer07Test {

    @Test
    public void test_factorial() {
        Assert.assertEquals(new Exer07().factorial(0), BigInteger.ONE);
        Assert.assertEquals(new Exer07().factorial(1), BigInteger.ONE);
        Assert.assertEquals(new Exer07().factorial(10), BigInteger.valueOf(3628800));
    }
}
