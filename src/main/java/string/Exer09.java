package string;

public class Exer09 {

    public int findVerifyNumberEAN13(String str) {
        int sum = 0;

        for (int i = 0; i < str.length(); i++) {
            int temp = Integer.parseInt(str.charAt(i) + "");
            sum += i % 2 == 0 ? temp : 3 * temp;
        }
        return 10 - (sum % 10);
    }
}
