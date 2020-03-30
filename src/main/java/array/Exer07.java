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

        int[][] arrayResult = new int[array.length][2];
        int count = 0;
        for (int i = 0; i < array.length - 1; i++) {

            for (int j = i + 1; j < array.length; j++) {
                if ((array[j] >= array[j - 1])) {
                    if ((j == array.length - 1)) {
                        arrayResult[count][0] = j - i + 1;
                        arrayResult[count][1] = i;
                        i = j - 1;
                        count++;
                        break;
                    }
                    continue;
                } else {
                    arrayResult[count][0] = j - i;
                    arrayResult[count][1] = i;
                    i = j - 1;
                    count++;
                    break;
                }
            }
        }
        int index = 0;
        int max = arrayResult[0][0];

        for (int i = 0; i < count; i++) {
            if (max < arrayResult[i][0]) {
                max = arrayResult[i][0];
                index = i;
            }
        }

        for (int i = arrayResult[index][1]; i < arrayResult[index][1] + arrayResult[index][0]; i++) {
            listResult.add(array[i]);
        }
        return listResult;
    }
}
