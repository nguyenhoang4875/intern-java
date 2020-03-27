package basic;

public class Exer15 {

    public int reverseBits(int n) {
        int reverse = 0;

        while (n > 0) {
            reverse = (reverse << 1) ^ (n & 1);
            n = n >> 1;
        }
        return reverse;
    }
}
