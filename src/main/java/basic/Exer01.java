package basic;

public class Exer01 {

    public int findGMD(int a, int b) {

        if (a * b == 0) {
            return 0;
        }

        while (a * b > 0) {
            if (a > b) {
                a %= b;
            } else {
                b %= a;
            }
        }
        return a + b;
    }

    public int findLCM(int a, int b) {

        return (a * b) == 0 ? 0 : ((a * b) / findGMD(a, b));
    }
}
