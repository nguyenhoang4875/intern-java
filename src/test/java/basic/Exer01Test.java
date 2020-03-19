package basic;

import org.junit.Assert;
import org.junit.Test;

public class Exer01Test {

    @Test
    public void test_findGMD() {
        Assert.assertEquals(new Exer01().findGMD(12, 16), 4);
        Assert.assertEquals(new Exer01().findGMD(0, 0), 0);
        Assert.assertEquals(new Exer01().findLCM(1, 0), 0);
        Assert.assertEquals(new Exer01().findGMD(0, 1), 0);
    }

    @Test
    public void test_findLCM() {
        Assert.assertEquals(new Exer01().findLCM(12, 16), 48);
        Assert.assertEquals(new Exer01().findLCM(0, 0), 0);
        Assert.assertEquals(new Exer01().findLCM(1, 0), 0);
        Assert.assertEquals(new Exer01().findLCM(0, 1), 0);
    }
}
