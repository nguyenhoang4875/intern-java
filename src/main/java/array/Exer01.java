package array;

public class Exer01 {

    public String findDuplicateNumbers(int[] array) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < array.length - 1; i++) {

            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    if (!result.toString().contains(array[i] + "")) {
                        result.append(array[i] + " ");
                    }
                }
            }
        }
        return result.toString().trim();
    }
}
