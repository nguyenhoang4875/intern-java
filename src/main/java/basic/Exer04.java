package basic;

public class Exer04 {

    public String findAllPrimesNotGreater(int n) {
        if (n < 1) {
            return "";
        } else if (n == 1) {
            return "1 1";
        } else {
            StringBuilder result = new StringBuilder();
            result.append("1 1 ");
            int temp1 = 1;
            int temp2 = 1;
            int temp3;

            while (n >= temp1 + temp2) {
                temp3 = temp1 + temp2;
                temp1 = temp2;
                temp2 = temp3;
                result.append(temp3 + " ");
            }
            return result.toString().trim();
        }
    }
}
