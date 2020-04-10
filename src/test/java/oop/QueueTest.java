package oop;

import org.junit.Assert;
import org.junit.Test;

public class QueueTest {

    @Test
    public void test_Queue() {
        Assert.assertTrue(new Queue().empty());
        Assert.assertEquals(new Queue().size(), 0);

        Queue<String> queueStr = new Queue<>();
        queueStr.offer("a");
        queueStr.offer("b");
        queueStr.offer("c");
        Assert.assertFalse(queueStr.empty());
        Assert.assertEquals(queueStr.size(), 3);
        Assert.assertEquals(queueStr.peek(), "a");
        Assert.assertEquals(queueStr.poll(), "a");

        Queue<Integer> queueInt = new Queue();

        for (int i = 0; i < 100; i++) {
            queueInt.offer(i);
        }
        Assert.assertFalse(queueInt.empty());
        Assert.assertEquals(queueInt.size(), 100);
        Assert.assertEquals(queueInt.peek(), Integer.valueOf(0));
        Assert.assertEquals(queueInt.poll(), Integer.valueOf(0));

    }
}