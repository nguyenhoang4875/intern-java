package array;

public class Exer09 {

    public int binarySearch(int[] array, int n) {
        int start = 0;
        int end = array.length;
        if (array.length == 0) return -1;
        else if (array.length == 1) return array[0] == n ? 0 : -1;

        while (end - start > 1) {
            int middle = (start + end) >>> 1;
            if (array[middle] == n) return middle;
            if (n > array[middle]) start = middle;
            else end = middle;
        }
        return -1;
    }
}
