package array;

import org.junit.Assert;
import org.junit.Test;

public class Exer13Test {

    @Test
    public void test_reduceMatrix() {
        Assert.assertArrayEquals(new Exer13().reduceMatrix(new int[][]{
                        {1, 2, 3, 4},
                        {5, 6, 7, 8},
                        {9, 0, 2, 5}}, 0, 0),
                new int[][]{
                        {6, 7, 8},
                        {0, 2, 5}});
        Assert.assertArrayEquals(new Exer13().reduceMatrix(new int[][]{
                        {1, 2, 3, 4},
                        {5, 6, 7, 8},
                        {9, 0, 2, 5}}, 0, 1),
                new int[][]{
                        {5, 7, 8},
                        {9, 2, 5}});
        Assert.assertArrayEquals(new Exer13().reduceMatrix(new int[][]{
                        {1, 2, 3, 4},
                        {5, 6, 7, 8},
                        {9, 0, 2, 5}}, 1, 0),
                new int[][]{
                        {2, 3, 4},
                        {0, 2, 5}});
        Assert.assertArrayEquals(new Exer13().reduceMatrix(new int[][]{
                        {1, 2, 3, 4},
                        {5, 6, 7, 8},
                        {9, 0, 2, 5}}, 1, 1),
                new int[][]{
                        {1, 3, 4},
                        {9, 2, 5}});
        Assert.assertArrayEquals(new Exer13().reduceMatrix(new int[][]{
                        {1, 2, 3, 4},
                        {5, 6, 7, 8},
                        {9, 0, 2, 5}}, -1, 0),
                new int[][]{
                        {1, 2, 3, 4},
                        {5, 6, 7, 8},
                        {9, 0, 2, 5}});
        Assert.assertArrayEquals(new Exer13().reduceMatrix(new int[][]{
                        {1, 2, 3, 4},
                        {5, 6, 7, 8},
                        {9, 0, 2, 5}},
                0, -1), new int[][]{
                        {1, 2, 3, 4},
                        {5, 6, 7, 8},
                        {9, 0, 2, 5}});
        Assert.assertArrayEquals(new Exer13().reduceMatrix(new int[][]{
                        {1, 2, 3, 4},
                        {5, 6, 7, 8},
                        {9, 0, 2, 5}}, 10, 0),
                new int[][]{
                        {1, 2, 3, 4},
                        {5, 6, 7, 8},
                        {9, 0, 2, 5}});
        Assert.assertArrayEquals(new Exer13().reduceMatrix(new int[][]{
                        {1, 2, 3, 4},
                        {5, 6, 7, 8},
                        {9, 0, 2, 5}}, 0, 10),
                new int[][]{
                        {1, 2, 3, 4},
                        {5, 6, 7, 8},
                        {9, 0, 2, 5}});
    }
}
