package oop;

import org.junit.Assert;
import org.junit.Test;

public class StackNumberTest {

    @Test
    public void test_push(){
        Assert.assertEquals(new StackNumber().push(1),1);
        Assert.assertEquals(new StackNumber(new int[]{1,2,3}).pop(),3);
        Assert.assertEquals(new StackNumber().empty(),true);
        Assert.assertEquals(new StackNumber(new int[]{1,2,3}).empty(),false);
        Assert.assertEquals(new StackNumber().size(),0);
        Assert.assertEquals(new StackNumber(new int[]{1,2,3}).size(),3);
        Assert.assertEquals(new StackNumber(new int[]{1,2,3}).peek(),3);
        Assert.assertEquals(new StackNumber(new int[]{1,2,3}).search(3),2);
        Assert.assertEquals(new StackNumber(new int[]{1,2,3}).search(4),-1);
    }
}
