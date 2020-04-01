package string;

import org.junit.Assert;
import org.junit.Test;

public class Exer04Test {

    @Test
    public void test_checkDuplicationString(){
        Assert.assertEquals(new Exer04().checkDuplicationString("abab"),true);
        Assert.assertEquals(new Exer04().checkDuplicationString("abccccabc"),true);
        Assert.assertEquals(new Exer04().checkDuplicationString("abcde"),false);
    }
}
