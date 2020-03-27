package basic;

public class Exer19 {

    public String convertDecimalToRoman(int number) {
        String[][] rules = {
                {"M", "1000"},
                {"CM", "900"},
                {"D", "500"},
                {"CD", "400"},
                {"C", "100"},
                {"XC", "90"},
                {"L", "50"},
                {"XL", "40"},
                {"X", "10"},
                {"IX", "9"},
                {"V", "5"},
                {"IV", "4"},
                {"I", "1"}
        };

        int value = 0;
        String result = "";

        for (int i = 0; i < rules.length; i++) {
            value = Integer.parseInt(rules[i][1]);

            while (value <= number) {
                result += rules[i][0];
                number -= value;
            }
        }
        return result;
    }
}
