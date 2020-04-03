package string;

public class Exer11 {

    public int subNumbers(String num1, String num2) {
        return getNumber(num1) - getNumber(num2);
    }

    public int getNumber(String number) {
        int result = 0;

        for (int i = 0; i < number.length(); i++) {
            result = result * 10 + number.charAt(i) - '0';
        }
        return result;
    }
}
