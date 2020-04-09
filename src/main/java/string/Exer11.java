package string;

public class Exer11 {

    public String subNumbers(String num1, String num2) {
        StringBuilder result = new StringBuilder();
        int lenStr1 = num1.length();
        int lenStr2 = num2.length();
        String maxNumLen;
        String minNumLen;
        boolean greaterThanZero;
        if ((lenStr1 > lenStr2) || (lenStr1 == lenStr2 && num1.compareTo(num2) >= 0)) {
            maxNumLen = new StringBuilder(num1).reverse().toString();
            minNumLen = new StringBuilder(num2).reverse().toString();
            greaterThanZero = true;
        } else {
            maxNumLen = new StringBuilder(num2).reverse().toString();
            minNumLen = new StringBuilder(num1).reverse().toString();
            greaterThanZero = false;
        }
        int temp;
        int carry = 0;

        for (int i = 0; i < minNumLen.length(); i++) {
            temp = maxNumLen.charAt(i) - minNumLen.charAt(i) + carry;
            if (temp < 0) {
                temp = temp + 10;
                carry = -1;
            } else {
                carry = 0;
            }

            result.append(temp);
        }
        if (maxNumLen.length() > minNumLen.length()) {

            for (int i = minNumLen.length(); i < maxNumLen.length(); i++) {
                if (carry != 0) {
                    temp = maxNumLen.charAt(i) + carry - '0';
                    carry = 0;
                    if (temp < 0) {
                        temp = temp + 10;
                        carry = -1;
                    }
                    result.append(temp);
                } else {
                    result.append(maxNumLen.charAt(i) - '0');
                }
            }
        }

        for (int i = result.length() - 1; i > 0; i--) {
            if (result.charAt(i) == '0') {
                result.replace(i, i + 1, "");
            } else {
                break;
            }
        }
        result = greaterThanZero ? result : result.append('-');
        return result.reverse().toString();
    }
}
