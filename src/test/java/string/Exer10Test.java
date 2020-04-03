package string;

import org.junit.Assert;
import org.junit.Test;

public class Exer10Test {

    @Test
    public void test_sumNumbers(){
        Assert.assertEquals(new Exer10().sumNumbers("2","4"),6);
        Assert.assertEquals(new Exer10().sumNumbers("1234","5678"),6912);
    }
}
