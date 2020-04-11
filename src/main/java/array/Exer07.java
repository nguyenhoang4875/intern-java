package array;

import java.util.ArrayList;
import java.util.List;

public class Exer07 {

    public List findLongestArrayNotFalling(int[] array) {
        List<Integer> listResult = new ArrayList<>();
        if (array.length == 1) {
            listResult.add(array[0]);
            return listResult;
        }
        int max = 0;
        int len = 0;
        int startMax = 0;

        for (int i = 0; i < array.length - 1; i++) {
            int j;

            for (j = i + 1; j < array.length; j++) {
                if (array[j] >= array[j - 1]) {
                    len++;
                } else {
                    break;
                }
            }
            if (max < len) {
                max = len;
                startMax = i;
            }
            len = 0;
            i = j - 1;
        }

        for (int i = startMax; i <= max + startMax; i++) {
            listResult.add(array[i]);
        }
        return listResult;
    }
}
