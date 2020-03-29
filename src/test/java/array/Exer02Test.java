package array;

import org.junit.Assert;
import org.junit.Test;

public class Exer02Test {

    @Test
    public void test_sumThreeNumberGreatestOfArray(){
        Assert.assertEquals(new Exer02().sumThreeNumberGreatestOfArray(new int[]{1,2,3,4,1,5,2}),12);
        Assert.assertEquals(new Exer02().sumThreeNumberGreatestOfArray(new int[]{1,1,1,1,1,1}),3);
        Assert.assertEquals(new Exer02().sumThreeNumberGreatestOfArray(new int[]{1,8,3,9,1,6,2}),23);
        Assert.assertEquals(new Exer02().sumThreeNumberGreatestOfArray(new int[]{1,2}),3);
    }
}
