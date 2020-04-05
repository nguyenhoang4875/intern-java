package string;

import org.junit.Assert;
import org.junit.Test;

public class Exer09Test {

    @Test
    public void test_findVerifyNumberEAN13() {
        Assert.assertEquals(new Exer09().findVerifyNumberEAN13("893850597419"), 4);
        Assert.assertEquals(new Exer09().findVerifyNumberEAN13("893464816435"), 5);
        Assert.assertEquals(new Exer09().findVerifyNumberEAN13("693497656494"), 2);
        Assert.assertEquals(new Exer09().findVerifyNumberEAN13("693596567981"), 4);
    }
}
