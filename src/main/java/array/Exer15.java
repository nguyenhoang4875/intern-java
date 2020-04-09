package array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Exer15 {

    public List<Integer> reduceArray(int[] array, int k) {
        if (k <= 0) {
            return Collections.emptyList();
        }

        for (int i = 0; i < array.length - 1; i++) {

            for (int j = i + 1; j < array.length; j++) {
                if (array[i] < array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        k = k > array.length ? array.length : k;
        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < k; i++) {
            result.add(array[i]);
        }
        return result;
    }
}
