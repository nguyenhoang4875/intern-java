package array;

public class Exer05 {

    public int sumAllPrimeNumbers(int[] array) {
        int sum = 0;

        for (int i : array) {
            if (checkPrimeNumber(i)) {
                sum += i;
            }
        }
        return sum;
    }

    public boolean checkPrimeNumber(int n) {
        if (n < 2) {
            return false;
        }
        if (n == 2) {
            return true;
        }

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
