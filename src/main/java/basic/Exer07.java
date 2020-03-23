package basic;

import java.math.BigInteger;

public class Exer07 {
    public BigInteger factorial(int n) {
        if (n <= 1) {
            return BigInteger.ONE;
        } else {
            BigInteger result = BigInteger.ONE;

            for (int i = 1; i <= n; i++) {
                result = result.multiply(BigInteger.valueOf(i));
            }
            return result;
        }
    }
}
