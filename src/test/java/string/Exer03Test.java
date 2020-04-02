package string;

import org.junit.Assert;
import org.junit.Test;

public class Exer03Test {

    @Test
    public void test_sumNumbersInString() {
        Assert.assertEquals(new Exer03().sumNumbersInString("abc 123 def 33 mn 3.221"), 380);
        Assert.assertEquals(new Exer03().sumNumbersInString("1 a 2 ~ 3@ 4# 5$ 6% 7^ 8& 9* 10("), 55);
        Assert.assertEquals(new Exer03().sumNumbersInString("abc  def  mn "), 0);
    }
}
