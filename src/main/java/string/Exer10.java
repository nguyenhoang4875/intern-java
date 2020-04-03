package string;

public class Exer10 {

    public int sumNumbers(String num1, String num2) {
        return getNumber(num1) + getNumber(num2);
    }

    public int getNumber(String number) {
        return number.chars().reduce(0, (a, b) -> 10 * a + b - '0');
    }
}
