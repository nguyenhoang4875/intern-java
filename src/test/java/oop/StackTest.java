package oop;

import org.junit.Assert;
import org.junit.Test;

public class StackTest {

    @Test
    public void test_push() {
        Assert.assertEquals(new Stack().push(1), 1);
        Assert.assertEquals(new Stack().empty(), true);
        Assert.assertEquals(new Stack().size(), 0);

        Stack stack = new Stack();
        stack.push(1);
        stack.push(2);
        stack.push("a");
        Assert.assertEquals(stack.pop(), "a");
        Assert.assertEquals(stack.empty(), false);
        Assert.assertEquals(stack.size(), 3);
        Assert.assertEquals(stack.peek(), "a");
    }
}