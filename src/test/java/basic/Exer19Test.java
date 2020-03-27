package basic;

import org.junit.Assert;
import org.junit.Test;

public class Exer19Test {

    @Test
    public void test_convertDecimalToRoman() {
        Assert.assertEquals(new Exer19().convertDecimalToRoman(1), "I");
        Assert.assertEquals(new Exer19().convertDecimalToRoman(4), "IV");
        Assert.assertEquals(new Exer19().convertDecimalToRoman(10), "X");
        Assert.assertEquals(new Exer19().convertDecimalToRoman(99), "XCIX");
    }
}
