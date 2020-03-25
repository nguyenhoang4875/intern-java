package basic;

import org.junit.Assert;
import org.junit.Test;

public class Exer12Test {

    @Test
    public void test_findSqrt(){
        Assert.assertEquals(new Exer12().findSqrt(-1,0.0001),0,0.0001);
        Assert.assertEquals(new Exer12().findSqrt(0,0.0001),0,0.0001);
        Assert.assertEquals(new Exer12().findSqrt(16,0.0001),4,0.0001);
        Assert.assertEquals(new Exer12().findSqrt(100,0.0001),10,0.0001);
        Assert.assertEquals(new Exer12().findSqrt(10,0.0001),3.1622,0.0001);
        Assert.assertEquals(new Exer12().findSqrt(20,0.0001),4.4721,0.0001);
    }
}
