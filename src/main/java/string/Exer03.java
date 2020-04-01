package string;

public class Exer03 {

    public int sumNumbersInString(String str) {
        str = str.replaceAll("(\\D)+", " ").trim();
        if (str.equals("")) {
            return 0;
        }
        String[] numbers = str.split("( )+");
        int sum = 0;

        for (String number : numbers) {
            sum += Integer.parseInt(number);
        }
        return sum;
    }
}
