package array;

public class Exer09 {

    public int binarySearch(int[] array, int n) {
        int start = 0;
        int end = array.length;
        int middle;

        while (end - start > 1) {
            middle = (start + end) >>> 1;
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
        }
        return array[0] == n ? 0 : -1;
    }
}
