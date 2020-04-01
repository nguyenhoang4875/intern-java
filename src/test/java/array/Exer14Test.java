package array;

import org.junit.Assert;
import org.junit.Test;

public class Exer14Test {

    @Test
    public void test_determinant(){
        Assert.assertEquals(new Exer14().determinant(new int[][]{{1}}),1);
        Assert.assertEquals(new Exer14().determinant(new int[][]{{1,0},{0,4}}),4);
        Assert.assertEquals(new Exer14().determinant(new int[][]{{1,2},{3,4}}),-2);
        Assert.assertEquals(new Exer14().determinant(new int[][]{{1,2,3},{4,5,6},{7,8,9}}),0);
        Assert.assertEquals(new Exer14().determinant(new int[][]{{1,2,5},{3,4,6},{8,7,9}}),-19);
        Assert.assertEquals(new Exer14().determinant(new int[][]{{1,3,2,4},{5,8,6,3},{5,6,0,9},{6,2,4,6}}),796);
        Assert.assertEquals(new Exer14().determinant(new int[][]{{1,5,3,9,4},{6,2,5,7,0},{0,2,4,3,1},{8,6,7,0,2},{6,2,9,5,4}}),6540);
    }
}
