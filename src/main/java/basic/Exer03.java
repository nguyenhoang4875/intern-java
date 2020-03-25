package basic;

import java.util.ArrayList;
import java.util.List;

public class Exer03 {

    public String calMultiNumPrimes(int n) {
        int i = 2;
        List<String> stringList = new ArrayList<>();

        while (n >= i) {

            while (n % i == 0) {
                stringList.add(i + "");
                n /= i;
            }
            i++;
        }
        return String.join("*", stringList);
    }
}
