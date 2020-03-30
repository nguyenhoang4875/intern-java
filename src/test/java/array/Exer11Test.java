package array;

import org.junit.Assert;
import org.junit.Test;

public class Exer11Test {

    @Test
    public void test_sumElementContinueGreaterThanZero(){
        Assert.assertEquals(new Exer11().sumElementContinueGreaterThanZero(new int[]{0}),0);
        Assert.assertEquals(new Exer11().sumElementContinueGreaterThanZero(new int[]{1,1}),2);
        Assert.assertEquals(new Exer11().sumElementContinueGreaterThanZero(new int[]{0, 1, -2, 8, 9, 0, 1, -2, 1, 1, 3, 1, 1}),18);
    }
}
