package array;

import java.util.LinkedList;
import java.util.List;

public class Exer10 {

    public List<Integer> insertInOrder(int[] array, int n) {
        List<Integer> listResult = new LinkedList<>();
        int index = 0;
        if (n > array[array.length - 1]) {
            index = array.length;
        } else {

            for (int i = 0; i < array.length; i++) {
                if (n < array[i]) {
                    index = i;
                    break;
                }
            }
        }

        for (int i : array) {
            listResult.add(i);
        }
        listResult.add(index, n);
        return listResult;
    }
}
