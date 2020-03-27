package array;

import org.junit.Assert;
import org.junit.Test;

public class Exer03Test {

    @Test
    public void test_calSumEvenSubOddOfArray(){
        Assert.assertEquals(new Exer03().calSumEvenSubOddOfArray(new int[]{1,3,5,6,7,8}),-2);
        Assert.assertEquals(new Exer03().calSumEvenSubOddOfArray(new int[]{1,0,5,6,7,8}),1);
        Assert.assertEquals(new Exer03().calSumEvenSubOddOfArray(new int[]{8,8,8,8,8,8}),48);
        Assert.assertEquals(new Exer03().calSumEvenSubOddOfArray(new int[]{7,7,7,7,7,7}),-42);
    }
}
