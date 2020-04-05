package array;

public class Exer11 {

    public int sumElementContinueGreaterThanZero(int[] array) {
        int sum = 0;
        int max = 0;
        for (int i = 0; i < array.length; i++) {

            sum = ((array[i] >= 0) ? sum + array[i] : 0);
            if (max < sum) {
                max = sum;
            }
        }
        return max;
    }
}
