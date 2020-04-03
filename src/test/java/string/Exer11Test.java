package string;

import org.junit.Assert;
import org.junit.Test;

public class Exer11Test {

    @Test
    public void test_sumNumbers(){
        Assert.assertEquals(new Exer11().subNumbers("2","1"),1);
        Assert.assertEquals(new Exer11().subNumbers("6912","5678"),1234);
    }
}
