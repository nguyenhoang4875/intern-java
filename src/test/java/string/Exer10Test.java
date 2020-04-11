package string;

import org.junit.Assert;
import org.junit.Test;

public class Exer10Test {

    @Test
    public void test_sumNumbers() {
        Assert.assertEquals(new Exer10().sumNumbers("2", "4"), "6");
        Assert.assertEquals(new Exer10().sumNumbers("1234", "5678"), "6912");
        Assert.assertEquals(new Exer10().sumNumbers("987654321", "12345679"), "1000000000");
        Assert.assertEquals(new Exer10().sumNumbers("12345679", "987654321"), "1000000000");
        Assert.assertEquals(new Exer10().sumNumbers("123456789", "111111123456789"), "111111246913578");
        Assert.assertEquals(new Exer10().sumNumbers("137817381738163715371349010965636511956113857619",
                "44963890099028666246118235758891030681149406204"),
                "182781271837192381617467246724527542637263263823");
    }
}
