package basic;

public class Exer20 {

    public int numSquareSum(int n) {
        int squareSum = 0;

        while (n != 0) {
            squareSum += (n % 10) * (n % 10);
            n /= 10;
        }
        return squareSum;
    }

    public boolean isHappyNumber(int n) {
        int child = n;

        do {
            child = numSquareSum(child);
        }
        while (child != 1 && child != 4 && child != 0);
        return child == 1;
    }
}
