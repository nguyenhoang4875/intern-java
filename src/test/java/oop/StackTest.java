package oop;

import org.junit.Assert;
import org.junit.Test;

public class StackTest {

    @Test
    public void test_push(){
        Assert.assertEquals(new Stack().push(1),1);
        Assert.assertEquals(new Stack(new Object[]{1,2,"a",3}).pop(),3);
        Assert.assertEquals(new Stack(new Object[]{1,2,"a",3,"b"}).pop(),"b");
        Assert.assertEquals(new Stack().empty(),true);
        Assert.assertEquals(new Stack(new Object[]{1,2,3}).empty(),false);
        Assert.assertEquals(new Stack().size(),0);
        Assert.assertEquals(new Stack(new Object[]{1,2,3}).size(),3);
        Assert.assertEquals(new Stack(new Object[]{1,2,3}).peek(),3);
        Assert.assertEquals(new Stack(new Object[]{1,2,3,"a"}).peek(),"a");
        Assert.assertEquals(new Stack(new Object[]{1,2,3,"a","b"}).search(3),2);
        Assert.assertEquals(new Stack(new Object[]{1,2,3,"a","b"}).search("b"),4);
        Assert.assertEquals(new Stack(new Object[]{1,2,3,"a","b"}).search("c"),-1);
        Assert.assertEquals(new Stack(new Object[]{1,2,3,"a","b"}).search(4),-1);
    }
}