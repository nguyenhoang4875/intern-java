package string;

import org.junit.Assert;
import org.junit.Test;

public class Exer10Test {

    @Test
    public void test_sumNumbers(){
        Assert.assertEquals(new Exer10().sumNumbers("2","4"),"6");
        Assert.assertEquals(new Exer10().sumNumbers("1234","5678"),"6912");
        Assert.assertEquals(new Exer10().sumNumbers("987654321","12345679"),"1000000000");
        Assert.assertEquals(new Exer10().sumNumbers("12345679","987654321"),"1000000000");
        Assert.assertEquals(new Exer10().sumNumbers("123456789","111111123456789"),"111111246913578");
    }
}
