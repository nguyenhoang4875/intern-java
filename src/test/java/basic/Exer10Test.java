package basic;

import org.junit.Assert;
import org.junit.Test;

public class Exer10Test {

    @Test
    public void test_findDayOfWeek() {
        Assert.assertEquals(new Exer10().findDayOfWeek(2020, 3, 23), "MONDAY");
    }
}
