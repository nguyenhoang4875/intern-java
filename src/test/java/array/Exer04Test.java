package array;

import org.junit.Assert;
import org.junit.Test;

public class Exer04Test {

    @Test
    public void test_softArrayWithCondition(){
        Assert.assertEquals(new Exer04().softArrayWithCondition(new int[]{1,5,6,8,7,3,4,9,2}),"2 4 6 8 9 7 5 3 1");
        Assert.assertEquals(new Exer04().softArrayWithCondition(new int[]{1,3,6,4,7,3,4,6,2}),"2 4 4 6 6 7 3 3 1");
        Assert.assertEquals(new Exer04().softArrayWithCondition(new int[]{1,3,5,7,9,8,6,4,2}),"2 4 6 8 9 7 5 3 1");
    }
}
