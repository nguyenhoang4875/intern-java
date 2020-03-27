package array;

import org.junit.Assert;
import org.junit.Test;

public class Exer01Test {

    @Test
    public void test_findDuplicateNumbers(){
        Assert.assertEquals(new Exer01().findDuplicateNumbers(new int[]{0,1,2,3,2,1}),"1 2");
        Assert.assertEquals(new Exer01().findDuplicateNumbers(new int[]{0,1,2,3,4,5}),"");
        Assert.assertEquals(new Exer01().findDuplicateNumbers(new int[]{0,1,2,1,3,4,1,2,1}),"1 2");
        Assert.assertEquals(new Exer01().findDuplicateNumbers(new int[]{0,1,2,33,1,3,4,33,1,2,1}),"1 2 33");
    }
}
