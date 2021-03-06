package string;

public class Exer06 {

    public String compressString(String str) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            int count = 1;

            while ((i + count < str.length()) && str.charAt(i) == str.charAt(i + count)) {
                count++;
            }
            if (count == 1) {
                result.append(str.charAt(i));
            } else {
                result.append(str.charAt(i) + "" + count);
            }
            i = i + count - 1;
        }
        return result.toString();
    }
}
