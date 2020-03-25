package basic;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class Exer14Test {

    @Test
    public void test_findNumbers() {
        Assert.assertEquals(new Exer14().findNumbers(), Arrays.asList(153, 370, 371, 407, 1634, 8208, 9474, 54748, 92727, 93084));
    }
}