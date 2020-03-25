package basic;

public class Exer12 {

    public double findSqrt(double n, double epsilon) {

        if (n <= 0) {
            return 0;
        } else {
            double temp = n;
            double y = (n + 1) / 2;

            while ((temp - y) >= epsilon) {
                temp = y;
                y = (n / (2.0 * y)) + (y / 2);
            }
            return y;
        }
    }
}
