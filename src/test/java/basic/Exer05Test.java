package basic;

import org.junit.Assert;
import org.junit.Test;

public class Exer05Test {

    @Test
    public void test_calQuadratic(){
        Assert.assertEquals(new Exer05().calQuadratic(1,1,1),"");
        Assert.assertEquals(new Exer05().calQuadratic(1,2,1),"x = -1.0");
        Assert.assertEquals(new Exer05().calQuadratic(1,-5,6),"x1 = 2.0   x2 = 3.0");
    }
}
