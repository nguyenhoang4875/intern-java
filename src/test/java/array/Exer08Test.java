package array;

import org.junit.Assert;
import org.junit.Test;

public class Exer08Test {

    @Test
    public void test_sumMinAndMaxOfArray(){
        Assert.assertEquals(new Exer08().sumMinAndMaxOfArray(new int[]{1,2,3,4,5,6,8,2,0,10}),10);
        Assert.assertEquals(new Exer08().sumMinAndMaxOfArray(new int[]{1,9,3,-1,5,68,2,0,10}),69);
        Assert.assertEquals(new Exer08().sumMinAndMaxOfArray(new int[]{1,1,1,1,1,1,1}),0);
    }
}
