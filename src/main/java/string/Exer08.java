package string;

public class Exer08 {

    public boolean checkBarcodeEAN13(String str) {
        int sum = 0;

        for (int i = 0; i < str.length(); i++) {
            int temp = Integer.parseInt(str.charAt(i) + "");
            sum += i % 2 == 0 ? temp : 3 * temp;
        }
        return sum % 10 == 0;
    }
}
