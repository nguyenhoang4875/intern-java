package oop;

import org.junit.Assert;
import org.junit.Test;

public class StackNumberTest {

    @Test
    public void test_push(){
        Assert.assertEquals(new StackNumber().push(1),1);
        Assert.assertEquals(new StackNumber().empty(),true);
        Assert.assertEquals(new StackNumber().size(),0);

        StackNumber stackNumber = new StackNumber();
        stackNumber.push(1);
        stackNumber.push(2);
        stackNumber.push(3);
        Assert.assertEquals(stackNumber.pop(),3);
        Assert.assertEquals(stackNumber.empty(),false);
        Assert.assertEquals(stackNumber.size(),3);
        Assert.assertEquals(stackNumber.peek(),3);
    }
}
