package string;

import org.junit.Assert;
import org.junit.Test;

public class Exer07Test {

    @Test
    public void test_extraString(){
        Assert.assertEquals(new Exer07().extraString("abc4e6fd"),"abcccceeeeeefd");
        Assert.assertEquals(new Exer07().extraString("ab13c"),"abbbbbbbbbbbbbc");
        Assert.assertEquals(new Exer07().extraString("ab2c3d4e5f6"),"abbcccddddeeeeeffffff");
    }
}
