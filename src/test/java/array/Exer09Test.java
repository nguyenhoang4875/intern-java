package array;

import org.junit.Assert;
import org.junit.Test;

public class Exer09Test {

    @Test
    public void test_binarySearch(){
        Assert.assertEquals(new Exer09().binarySearch(new int[] {1},0),-1);
        Assert.assertEquals(new Exer09().binarySearch(new int[] {1},1),0);
        Assert.assertEquals(new Exer09().binarySearch(new int[] {1,2,3,4,5},0),-1);
        Assert.assertEquals(new Exer09().binarySearch(new int[] {1,2,3,4,5},6),-1);
        Assert.assertEquals(new Exer09().binarySearch(new int[] {1,2,3,4,5},3),2);
        Assert.assertEquals(new Exer09().binarySearch(new int[] {1,2,3,4,5,7},6),-1);
        Assert.assertEquals(new Exer09().binarySearch(new int[] {1,2,3,4,5,7,8},6),-1);
        Assert.assertEquals(new Exer09().binarySearch(new int[] {5,4,3,2,1},0),-1);
        Assert.assertEquals(new Exer09().binarySearch(new int[] {5,4,3,2,1},6),-1);
        Assert.assertEquals(new Exer09().binarySearch(new int[] {5,4,3,2,1},3),2);
        Assert.assertEquals(new Exer09().binarySearch(new int[] {5,4,3,2,1,-1},0),-1);
        Assert.assertEquals(new Exer09().binarySearch(new int[] {5,4,3,2,1,-1,-2},0),-1);
    }
}
