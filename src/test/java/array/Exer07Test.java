package array;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class Exer07Test {

    @Test
    public void test_findLongestArrayNotFalling() {
        Assert.assertEquals(new Exer07().findLongestArrayNotFalling(new int[]{1}), Arrays.asList(1));
        Assert.assertEquals(new Exer07().findLongestArrayNotFalling(new int[]{1, 0, -1}), Arrays.asList(1));
        Assert.assertEquals(new Exer07().findLongestArrayNotFalling(new int[]{1, 2, 3, 2, 3, 4, 5, 0, 4, 5, 6}), Arrays.asList(2, 3, 4, 5));
        Assert.assertEquals(new Exer07().findLongestArrayNotFalling(new int[]{1, 2, 3, 6, 0, 3, 4, 5, 7, 8, 2, 1, 2, 3, 4, 5, 6, 7}), Arrays.asList(1, 2, 3, 4, 5, 6, 7));
        Assert.assertEquals(new Exer07().findLongestArrayNotFalling(new int[]{1, 2, 3, 4, 5, 2, 3, 4, 3, 4, 5}), Arrays.asList(1, 2, 3, 4, 5));
    }
}
