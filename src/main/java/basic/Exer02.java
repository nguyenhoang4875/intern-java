package basic;

public class Exer02 {

    public int findSumAllDigit(int n) {
        int result = 0;

        while (n > 0) {
            result += n % 10;
            n /= 10;
        }
        return result;
    }
}