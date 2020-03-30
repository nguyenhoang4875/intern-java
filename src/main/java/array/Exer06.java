
package array;

public class Exer06 {

    public String softArrayWithCondition(int[] array) {

        for (int i = 0; i < array.length - 1; i++) {

            for (int j = i + 1; j < array.length; j++) {
                if ((array[i] + array[j]) % 2 == 0) {
                    if ((array[i] % 2 == 0) == (array[i] > array[j])) {
                        int temp = array[i];
                        array[i] = array[j];
                        array[j] = temp;
                    }
                }
            }
        }
        StringBuilder result = new StringBuilder();

        for (int i : array) {
            result.append(i + " ");
        }
        return result.toString().trim();
    }
}