package string;

import org.junit.Assert;
import org.junit.Test;

public class Exer02Test {

    @Test
    public void test_checkSymmetryString() {
        Assert.assertEquals(new Exer02().checkSymmetryString("abcdcba"), true);
        Assert.assertEquals(new Exer02().checkSymmetryString("abccba"), true);
        Assert.assertEquals(new Exer02().checkSymmetryString("abcdcbe"), false);
        Assert.assertEquals(new Exer02().checkSymmetryString("abcdcea"), false);
        Assert.assertEquals(new Exer02().checkSymmetryString("abcdecba"), false);
    }
}
