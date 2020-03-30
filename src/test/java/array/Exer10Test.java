package array;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class Exer10Test {

    @Test
    public void test_insertInOrder(){
        Assert.assertEquals(new Exer10().insertInOrder(new int[]{1,2,4,5,6},3), Arrays.asList(1,2,3,4,5,6));
        Assert.assertEquals(new Exer10().insertInOrder(new int[]{1,2,4,5,6},0), Arrays.asList(0,1,2,4,5,6));
        Assert.assertEquals(new Exer10().insertInOrder(new int[]{1,2,4,5,6},7), Arrays.asList(1,2,4,5,6,7));
    }
}
