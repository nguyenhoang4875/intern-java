package array;

public class Exer03 {

    public int calSumEvenSubOddOfArray(int[] array) {
        int sum = 0;

        for (int i : array) {
            if (i % 2 != 0) {
                sum -= i;
            } else {
                sum += i;
            }
        }
        return sum;
    }
}
