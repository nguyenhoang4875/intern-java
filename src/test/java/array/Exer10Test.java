package array;

import org.junit.Assert;
import org.junit.Test;

public class Exer10Test {

    @Test
    public void test_insertInOrder() {
        Assert.assertArrayEquals(new Exer10().insertInOrder(new int[]{1, 2, 4, 5, 6}, 3), new int[]{1, 2, 3, 4, 5, 6});
        Assert.assertArrayEquals(new Exer10().insertInOrder(new int[]{1, 2, 4, 5, 6}, 0), new int[]{0, 1, 2, 4, 5, 6});
        Assert.assertArrayEquals(new Exer10().insertInOrder(new int[]{1, 2, 4, 5, 6}, 7), new int[]{1, 2, 4, 5, 6, 7});
    }
}
