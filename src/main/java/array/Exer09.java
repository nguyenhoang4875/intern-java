package array;

public class Exer09 {

    public int binarySearch(int[] array, int n) {
        if (array.length == 1) {
            return array[0] == n ? 0 : -1;
        }
        if ((array[0] < array[1]) == (n < array[0] || n > array[array.length - 1])) {
            return -1;
        }

        int start = 0;
        int end = array.length;
        int middle = array.length / 2;

        while (start <= end && (end - start) != 1) {
            if (array[middle] == n) {
                return middle;
            }
            if (array[1] >= array[0]) {
                if (n > array[middle]) {
                    start = middle;
                } else {
                    end = middle;
                }
            } else {
                if (n > array[middle]) {
                    end = middle;
                } else {
                    start = middle;
                }
            }
            middle = (start + end) / 2;
        }
        return -1;
    }
}
