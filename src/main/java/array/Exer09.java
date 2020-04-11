package array;

public class Exer09 {

    public int binarySearch(int[] array, int n) {
        int start = -1;
        int end = array.length;

        while (end - start > 1) {
            int middle = (start + end) >>> 1;
            if (array[middle] == n) return middle;
            if (n > array[middle]) start = middle;
            else end = middle;
        }
        return -1;
    }
}
