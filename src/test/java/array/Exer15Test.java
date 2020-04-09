package array;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;

public class Exer15Test {

    @Test
    public void test_reduceArray() {
        Assert.assertEquals(new Exer15().reduceArray(new int[]{1, 5, 6, 3, 2, 9, 8, 7, 4}, 4), Arrays.asList(9, 8, 7, 6));
        Assert.assertEquals(new Exer15().reduceArray(new int[]{1, 5, 6, 3, 2, 9, 8, 7, 4}, 0), Collections.emptyList());
        Assert.assertEquals(new Exer15().reduceArray(new int[]{1, 5, 6, 3, 2, 9, 8, 7, 4}, 10), Arrays.asList(9, 8, 7, 6, 5, 4, 3, 2, 1));
        Assert.assertEquals(new Exer15().reduceArray(new int[]{6, 1, 6, 3, 2, 6, 8, 7, 4}, 5), Arrays.asList(8, 7, 6, 6, 6));
    }
}
