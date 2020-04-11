package string;

public class Exer10 {

    public String sumNumbers(String num1, String num2) {
        StringBuilder result = new StringBuilder();
        int maxLen = num1.length() >= num2.length() ? num1.length() : num2.length();
        int carry = 0;

        for (int i = 0; i < maxLen; i++) {
            int temp = digitFromRight(num1, i) + digitFromRight(num2, i);
            result.insert(0, (temp % 10 + carry) % 10);
            carry = (temp + carry) / 10;
        }
        if (carry > 0) {
            result.insert(0, carry);
        }
        return result.toString();
    }

    public int digitFromRight(String number, int index) {
        if (index >= number.length()) {
            return 0;
        }
        return number.charAt(number.length() - 1 - index) - '0';
    }
}
