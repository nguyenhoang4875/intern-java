
package array;

import org.junit.Assert;
import org.junit.Test;

public class Exer06Test {

    @Test
    public void test_softArrayWithCondition(){
        Assert.assertEquals(new Exer06().softArrayWithCondition(new int[]{1,5,6,8,7,3,4,9,2}),"9 7 2 4 5 3 6 1 8");
        Assert.assertEquals(new Exer06().softArrayWithCondition(new int[]{1,3,6,4,7,3,4,6,2}),"7 3 2 4 3 1 4 6 6");
        Assert.assertEquals(new Exer06().softArrayWithCondition(new int[]{1,3,5,7,9,8,6,4,2}),"9 7 5 3 1 2 4 6 8");
    }
}