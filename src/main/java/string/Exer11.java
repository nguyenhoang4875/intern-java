package string;

public class Exer11 {

    public String subNumbers(String num1, String num2) {
        if ((num2.length() > num1.length()) || (num2.length() == num1.length() && num2.compareTo(num1) > 0)) {
            return "-" + subNumbers(num2, num1);
        }
        StringBuilder result = new StringBuilder();
        int carry = 0;

        for (int i = 0; i < num1.length(); i++) {
            int temp = digitFromRight(num1, i) - digitFromRight(num2, i) + carry;
            if (temp < 0) {
                temp = temp + 10;
                carry = -1;
            } else {
                carry = 0;
            }
            result.insert(0, temp);
        }

        int first = 0;

        while (first < result.length() && result.charAt(first) == '0') {
            first++;
        }
        return result.substring(first);
    }

    public int digitFromRight(String number, int index) {
        if (index >= number.length()) {
            return 0;
        }
        return number.charAt(number.length() - 1 - index) - '0';
    }
}
