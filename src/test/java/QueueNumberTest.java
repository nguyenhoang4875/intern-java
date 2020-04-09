import oop.QueueNumber;
import org.junit.Assert;
import org.junit.Test;

public class QueueNumberTest {

    @Test
    public void test_QueueNumber(){
        Assert.assertTrue(new QueueNumber().empty());
        Assert.assertEquals(new QueueNumber().size(),0);

        QueueNumber queueNumber = new QueueNumber();

        for (int i = 0; i <100 ; i++) {
            queueNumber.offer(i);
        }
        Assert.assertFalse(queueNumber.empty());
        Assert.assertEquals(queueNumber.size(),100);
        Assert.assertEquals(queueNumber.peek(),0);
        Assert.assertEquals(queueNumber.poll(),0);

    }
}
