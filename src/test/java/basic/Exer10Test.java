package basic;

import org.junit.Assert;
import org.junit.Test;

public class Exer10Test {

    @Test
    public void test_findDayOfWeek() {
        Assert.assertEquals(new Exer10().findDayOfWeek(2020, 11, 31), "");
        Assert.assertEquals(new Exer10().findDayOfWeek(2020, 4, 31), "");
        Assert.assertEquals(new Exer10().findDayOfWeek(2020, 6, 31), "");
        Assert.assertEquals(new Exer10().findDayOfWeek(2020, 9, 31), "");
        Assert.assertEquals(new Exer10().findDayOfWeek(2020, 11, 31), "");
        Assert.assertEquals(new Exer10().findDayOfWeek(2000, 2, 29), "TUESDAY");
        Assert.assertEquals(new Exer10().findDayOfWeek(2020, 2, 29), "SATURDAY");
        Assert.assertEquals(new Exer10().findDayOfWeek(2100, 2, 29), "");
        Assert.assertEquals(new Exer10().findDayOfWeek(2020, 3, 23), "MONDAY");
    }

    @Test
    public void test_isValidDate() {
        Assert.assertEquals(new Exer10().isDateValid(2020, 2, 30), false);
        Assert.assertEquals(new Exer10().isDateValid(2020, 13, 30), false);
        Assert.assertEquals(new Exer10().isDateValid(2020, 0, 30), false);
        Assert.assertEquals(new Exer10().isDateValid(2020, 4, 0), false);
        Assert.assertEquals(new Exer10().isDateValid(2020, 4, 31), false);
        Assert.assertEquals(new Exer10().isDateValid(2020, 5, 32), false);
        Assert.assertEquals(new Exer10().isDateValid(2020, 6, 31), false);
        Assert.assertEquals(new Exer10().isDateValid(2020, 9, 31), false);
        Assert.assertEquals(new Exer10().isDateValid(2020, 11, 31), false);
        Assert.assertEquals(new Exer10().isDateValid(2000, 2, 29), true);
        Assert.assertEquals(new Exer10().isDateValid(2020, 2, 29), true);
        Assert.assertEquals(new Exer10().isDateValid(2100, 2, 29), false);
        Assert.assertEquals(new Exer10().isDateValid(2020, 3, 23), true);
    }
}
