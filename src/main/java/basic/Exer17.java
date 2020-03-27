package basic;

public class Exer17 {

    public double findSqrt(double n) {
        double epsilon = 0.0001;
        if (n <= 0) {
            return 0;
        }
        double start = 0;
        double end = n;
        if (n < 1) {
            end = 1;
        }
        double middle = (start + end) / 2;

        while (Math.abs(n - middle * middle) > epsilon) {
            if ((n - start * start) * (n - middle * middle) < 0) {
                end = middle;
            } else {
                start = middle;
            }
            middle = (start + end) / 2;
        }
        return middle;

    }
}
