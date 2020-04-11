package string;

public class Exer11 {

    public String subNumbers(String num1, String num2) {
        StringBuilder result = new StringBuilder();
        if ((num2.length() > num1.length()) || (num2.length() == num1.length() && num2.compareTo(num1) > 0)) {
            return "-" + subNumbers(num2, num1);
        }
        int temp;
        int carry = 0;

        for (int i = 0; i < num1.length(); i++) {
            temp = digitFromRight(num1, i) - digitFromRight(num2, i) + carry;
            if (temp < 0) {
                temp = temp + 10;
                carry = -1;
            } else {
                carry = 0;
            }
            result.append(temp);
        }

        for (int i = result.length() - 1; i > 0; i--) {
            if (result.charAt(i) == '0') {
                result.replace(i, i + 1, "");
            } else {
                break;
            }
        }
        return result.reverse().toString();
    }

    public int digitFromRight(String number, int index) {
        if (index >= number.length()) {
            return 0;
        }
        return number.charAt(number.length() - 1 - index) - '0';
    }
}
