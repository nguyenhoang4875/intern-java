package array;

import org.junit.Assert;
import org.junit.Test;

public class Exer12Test {

    @Test
    public void test_checkSameArrays(){
        Assert.assertEquals(new Exer12().checkSameArrays(new int[]{1,2,3,4},new int[]{1,2,3,4}),true);
        Assert.assertEquals(new Exer12().checkSameArrays(new int[]{1,2,3,4},new int[]{4,2,3,1}),true);
        Assert.assertEquals(new Exer12().checkSameArrays(new int[]{1,2,3,4},new int[]{1,3,4,2}),false);
        Assert.assertEquals(new Exer12().checkSameArrays(new int[]{1,1,1,1},new int[]{1,1,1,1}),true);
        Assert.assertEquals(new Exer12().checkSameArrays(new int[]{1,2,3,4},new int[]{4,3,2,1}),false);
        Assert.assertEquals(new Exer12().checkSameArrays(new int[]{1,2,3,4,5},new int[]{4,2,3,1}),false);
        Assert.assertEquals(new Exer12().checkSameArrays(new int[]{1,2,3,4},new int[]{1,2,3,5}),false);
        Assert.assertEquals(new Exer12().checkSameArrays(new int[]{0,2,3,4},new int[]{1,2,3,4}),false);
        Assert.assertEquals(new Exer12().checkSameArrays(new int[]{0,2,3,4},new int[]{1,2,3,5}),false);
    }
}
