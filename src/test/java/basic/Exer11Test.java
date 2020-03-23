package basic;

import org.junit.Assert;
import org.junit.Test;

public class Exer11Test {

    @Test
    public void test_findMonthName(){
        Assert.assertEquals(new Exer11().findMonthName(0),"");
        Assert.assertEquals(new Exer11().findMonthName(5),"MAY");
        Assert.assertEquals(new Exer11().findMonthName(13),"");
    }
}
