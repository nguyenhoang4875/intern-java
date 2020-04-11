package string;

import org.junit.Assert;
import org.junit.Test;

public class Exer11Test {

    @Test
    public void test_sumNumbers() {
        Assert.assertEquals(new Exer11().subNumbers("2", "1"), "1");
        Assert.assertEquals(new Exer11().subNumbers("6912", "5678"), "1234");
        Assert.assertEquals(new Exer11().subNumbers("5678", "6912"), "-1234");
        Assert.assertEquals(new Exer11().subNumbers("123", "5678"), "-5555");
        Assert.assertEquals(new Exer11().subNumbers("1000000", "987"), "999013");
        Assert.assertEquals(new Exer11().subNumbers("987", "1000000"), "-999013");
        Assert.assertEquals(new Exer11().subNumbers(
                "137817381738163715371357189182918298129829182981",
                "8178217281786173715325362"),
                "137817381738163715371349010965636511956113857619");
        Assert.assertEquals(new Exer11().subNumbers(
                "137817381738163715371349010965636511956113857619",
                "182781271837192381617467246724527542637263263823"),
                "-44963890099028666246118235758891030681149406204");
    }
}
