package array;

import org.junit.Assert;
import org.junit.Test;

public class Exer05Test {

    @Test
    public void test_sumAllPrimeNumbers() {
        Assert.assertEquals(new Exer05().sumAllPrimeNumbers(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9}), 17);
        Assert.assertEquals(new Exer05().sumAllPrimeNumbers(new int[]{1, 4, 6, 8, 9, 10, 12, 15}), 0);
        Assert.assertEquals(new Exer05().sumAllPrimeNumbers(new int[]{2, 3, 5, 7, 11, 13, 17, 19, 23}), 100);
    }
}
