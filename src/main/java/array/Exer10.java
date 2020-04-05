package array;

public class Exer10 {

    public int[] insertInOrder(int[] array, int n) {
        int[] result = new int[array.length + 1];
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

        for (int i = 0; i < result.length; i++) {
            if (i < index) {
                result[i] = array[i];
            } else if (i > index) {
                result[i] = array[i - 1];
            } else {
                result[i] = n;
            }
        }
        return result;
    }
}
