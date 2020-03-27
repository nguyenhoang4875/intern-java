package basic;

public class Exer05 {

    public String calQuadratic(double a, double b, double c) {
        double dental = b * b - 4 * a * c;
        if (dental < 0) {
            return "";
        } else if (dental == 0) {
            return "x = " + (-b / (2 * a));
        } else {
            return "x1 = " + ((-b - Math.sqrt(dental)) / (2 * a)) + "   " + "x2 = " + ((-b + Math.sqrt(dental)) / (2 * a));
        }
    }
}
