package string;

public class Exer12 {

    public String findMaxNumber(int[] array) {
        for (int i = 0; i < array.length; i++) {

            for (int j = i + 1; j < array.length; j++) {
                int a = array[i];
                int b = array[j];
                if ((a + "" + b).compareTo(b + "" + a) < 0) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        StringBuilder result = new StringBuilder();

        for (int number : array) {
            result.append(number);
        }
        return result.toString();
    }
}
