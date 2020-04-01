package string;

import org.junit.Assert;
import org.junit.Test;

public class Exer06Test {

    @Test
    public void test_compressString() {
        Assert.assertEquals(new Exer06().compressString("abcccceeeeeefd"), "abc4e6fd");
        Assert.assertEquals(new Exer06().compressString("abbbbbbbbbbbbbc"), "ab13c");
        Assert.assertEquals(new Exer06().compressString("abcdef"), "abcdef");
        Assert.assertEquals(new Exer06().compressString("abbcccddddeeeeeffffff"), "ab2c3d4e5f6");
    }
}
