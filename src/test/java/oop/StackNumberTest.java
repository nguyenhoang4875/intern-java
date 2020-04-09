package oop;

import org.junit.Assert;
import org.junit.Test;

public class StackNumberTest {

    @Test
    public void test_push(){
        Assert.assertEquals(new StackNumber().push(1),1);
        Assert.assertTrue(new StackNumber().empty());
        Assert.assertEquals(new StackNumber().size(),0);

        StackNumber stackNumber = new StackNumber();
        for (int i = 0; i <100 ; i++) {
           stackNumber.push(i);
        }
        Assert.assertEquals(stackNumber.size(),100);
        Assert.assertEquals(stackNumber.peek(),99);
        Assert.assertEquals(stackNumber.pop(),99);
        Assert.assertFalse(stackNumber.empty());
    }
}
