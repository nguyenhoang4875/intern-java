
package basic;

public class Exer18 {

    public int convertRomanToDecimal(String romanNumber) {
        String[][] rules = {
                {"CM", "900"},
                {"M", "1000"},
                {"CD", "400"},
                {"D", "500"},
                {"XC", "90"},
                {"C", "100"},
                {"XL", "40"},
                {"L", "50"},
                {"IX", "9"},
                {"X", "10"},
                {"IV", "4"},
                {"V", "5"},
                {"I", "1"}
        };
        int result = 0;
        int index = 0;

        for (int i = 0; i < rules.length; i++) {
            index = romanNumber.indexOf(rules[i][0]);

            while (index != -1) {
                result += Integer.parseInt(rules[i][1]);
                romanNumber = romanNumber.replaceFirst(rules[i][0], "");
                index = romanNumber.indexOf(rules[i][0]);
            }
        }
        return result;
    }
}

