package basic;

public class Exer17 {

    public double findSqrt(double n) {
        double epsilon = 0.0001;
        if (n <= 0) {
            return 0;
        }
        double start = 0;
        double end = n < 1 ? 1 : n;
        double middle = (start + end) / 2;

        while (end - middle > epsilon) {
            if (middle * middle > n) {
                end = middle;
            } else {
                start = middle;
            }
            middle = (start + end) / 2;
        }
        return middle;

    }
}
