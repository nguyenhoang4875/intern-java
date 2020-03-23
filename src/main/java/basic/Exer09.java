package basic;

public class Exer09 {
    public double calPi(double epsilon) {
        double result = 0;
        double i = 2;
        double temp = 0;

        while ((temp = 4 / (i * (i + 1) * (i + 2))) >= epsilon) {
            if (i % 4 != 0) {
                result += temp/4;

            } else {
                result -= temp/4;
            }
            i += 2;
        }
        return (3 + 4 * result);
    }
}
