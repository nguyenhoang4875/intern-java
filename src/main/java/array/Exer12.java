package array;

public class Exer12 {

    public boolean checkSameArrays(int[] a, int[] b) {
        if (a.length != b.length) {
            return false;
        }
        if (checkEqual(a, b)) {
            return true;
        }

        for (int i = 0; i < a.length; i++) {

            for (int j = a.length - 1; j > i; j--) {
                if ((a[i] != b[i]) && (a[j] != b[j])) {
                    int temp = b[i];
                    b[i] = b[j];
                    b[j] = temp;
                    return checkEqual(a, b);
                }
            }
        }
        return false;
    }

    public boolean checkEqual(int[] a, int[] b) {

        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i]) {
                return false;
            }
        }
        return true;
    }
}
