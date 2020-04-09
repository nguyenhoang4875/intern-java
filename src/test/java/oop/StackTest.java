package oop;

import org.junit.Assert;
import org.junit.Test;

public class StackTest {

    @Test
    public void test_push() {
        Assert.assertTrue(new Stack().empty());
        Assert.assertEquals(new Stack().size(), 0);

        Stack<String> stack = new Stack();
        stack.push("a");
        stack.push("b");
        stack.push("c");
        Assert.assertFalse(stack.empty());
        Assert.assertEquals(stack.size(), 3);
        Assert.assertEquals(stack.peek(), "c");
        Assert.assertEquals(stack.pop(), "c");

        Stack<Integer> stackInt = new Stack();

        for (int i = 0; i < 100; i++) {
            stackInt.push(i);
        }
        Assert.assertFalse(stack.empty());
        Assert.assertEquals(stackInt.size(), 100);
        Assert.assertEquals(stackInt.peek(), Integer.valueOf(99));
        Assert.assertEquals(stackInt.pop(), Integer.valueOf(99));
    }
}