package basic;

import org.junit.Assert;
import org.junit.Test;

public class Exer18Test {

    @Test
    public void test_convertRomanToDecimal() {
        Assert.assertEquals(new Exer18().convertRomanToDecimal("I"), 1);
        Assert.assertEquals(new Exer18().convertRomanToDecimal("IV"), 4);
        Assert.assertEquals(new Exer18().convertRomanToDecimal("X"), 10);
        Assert.assertEquals(new Exer18().convertRomanToDecimal("XCIX"), 99);
    }
}
