package basic;

import org.junit.Assert;
import org.junit.Test;

public class Exer17Test {

    @Test
    public void test_findSqrt(){
        Assert.assertEquals(new Exer17().findSqrt(0),0,0.0001);
        Assert.assertEquals(new Exer17().findSqrt(0.5),0.7071,0.0001);
        Assert.assertEquals(new Exer17().findSqrt(1),1,0.0001);
        Assert.assertEquals(new Exer17().findSqrt(4),2,0.0001);
        Assert.assertEquals(new Exer17().findSqrt(10),3.1623,0.0001);
    }
}
