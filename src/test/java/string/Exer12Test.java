package string;

import org.junit.Assert;
import org.junit.Test;

public class Exer12Test {

    @Test
    public void test_findMaxNumber() {
        Assert.assertEquals(new Exer12().findMaxNumber(new int[]{10, 2}), "210");
        Assert.assertEquals(new Exer12().findMaxNumber(new int[]{461, 46}), "46461");
        Assert.assertEquals(new Exer12().findMaxNumber(new int[]{461, 46, 23,231,58,582}), "585824646123231");
        Assert.assertEquals(new Exer12().findMaxNumber(new int[]{461, 46}), "46461");
        Assert.assertEquals(new Exer12().findMaxNumber(new int[]{46, 461,55,32,8}), "8554646132");
        Assert.assertEquals(new Exer12().findMaxNumber(new int[]{1, 4, 5, 9, 42, 52, 94}), "9945524421");
        Assert.assertEquals(new Exer12().findMaxNumber(new int[]{1, 4, 5, 9, 42, 56, 94}), "9945654421");
    }
}
