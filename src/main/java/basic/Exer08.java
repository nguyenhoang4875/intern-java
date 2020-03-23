package basic;

public class Exer08 {

    public double calPi(double epsilon) {
        double result = 0;
        double i = 0;

        while (4 / (2 * i + 1) >= epsilon) {
            if (i % 2 == 0) {
                result += 1 / (2 * i + 1);

            } else {
                result -= 1 / (2 * i + 1);
            }
            i++;
        }
        return 4 * result;
    }
}
