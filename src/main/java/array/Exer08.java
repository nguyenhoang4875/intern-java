package array;

import java.util.Arrays;

public class Exer08 {

    public int sumMinAndMaxOfArray(int[] array) {
        array = Arrays.stream(array).sorted().toArray();
        return array[array.length - 1] - array[0];
    }
}
