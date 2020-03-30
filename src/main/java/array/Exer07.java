package array;

import java.util.ArrayList;
import java.util.List;

public class Exer07 {

    public static void main(String[] args) {
        new Exer07().findLongestArrayNotFalling(new int[]{0, 1, 2, 1, 2, 1, 2, 3, 4, 5, 6, 7, 8, 9, 1, 2, 3, 0, 1, 2, 3, 4, 5, 0});
    }

    public List findLongestArrayNotFalling(int[] array) {

        int[][] arrayResult = new int[array.length][2];
        List<Integer> listResult = new ArrayList<>();
        int count = 0;
        if (array.length == 1) {
            listResult.add(array[0]);
            return listResult;
        }

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
                    if (j == (array.length - 1)) {
                        arrayResult[count][0] = 1;
                        arrayResult[count][1] = j;
                        count++;
                    }
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
        StringBuilder result = new StringBuilder();

        for (int i = arrayResult[index][1]; i < arrayResult[index][1] + arrayResult[index][0]; i++) {
            listResult.add(array[i]);
        }
        return listResult;
    }
}
