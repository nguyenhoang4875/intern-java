package string;

public class Exer10 {

    public String sumNumbers(String num1, String num2) {
        StringBuilder result = new StringBuilder();
        int lenStr1 = num1.length();
        int lenStr2 = num2.length();
        String maxNumLen;
        String minNumLen;
        if (lenStr1 >= lenStr2) {
            maxNumLen = new StringBuilder(num1).reverse().toString();
            minNumLen = new StringBuilder(num2).reverse().toString();
        } else {
            maxNumLen = new StringBuilder(num2).reverse().toString();
            minNumLen = new StringBuilder(num1).reverse().toString();
        }
        int temp;
        int carry = 0;

        for (int i = 0; i < minNumLen.length(); i++) {
            temp = maxNumLen.charAt(i) - '0' + minNumLen.charAt(i) - '0';
            result.append((temp % 10 + carry) % 10);
            carry = (temp + carry) / 10;
        }
        if (maxNumLen.length() > minNumLen.length()) {

            for (int i = minNumLen.length(); i < maxNumLen.length(); i++) {
                if (carry != 0) {
                    temp = maxNumLen.charAt(i) - '0' + carry;
                    result.append(temp % 10 + carry);
                    carry = temp / 10;
                } else {
                    result.append(maxNumLen.charAt(i) - '0');
                }
            }
        }
        return result.reverse().toString();
    }
}
