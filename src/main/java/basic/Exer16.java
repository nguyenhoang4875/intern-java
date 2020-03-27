package basic;

public class Exer16 {

    public int countQuantityPrimesNotGreater(int n) {
        if (n < 1) {
            return 0;
        } else if (n == 1) {
            return 2;
        } else {
            int count = 2;
            int temp1 = 1;
            int temp2 = 1;
            int temp3;

            while (n >= temp1 + temp2) {
                temp3 = temp1 + temp2;
                temp1 = temp2;
                temp2 = temp3;
                count++;
            }
            return count;
        }
    }
}
