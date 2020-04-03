package string;

public class Exer07 {

    public String extraString(String str) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            StringBuilder temp = new StringBuilder();

            for (int j = i + 1; j < str.length(); j++) {
                if (str.charAt(j) >= '0' && str.charAt(j) <= '9') {
                    temp.append(str.charAt(j) + "");
                } else {
                    break;
                }
            }
            if (temp.length() > 0) {
                for (int j = 0; j < Integer.parseInt(temp.toString()); j++) {
                    result.append(str.charAt(i) + "");
                }
                i = i + temp.length();
            } else {
                result.append(str.charAt(i) + "");
            }
        }
        return result.toString();
    }
}
