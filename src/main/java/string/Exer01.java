package string;

public class Exer01 {

    public String[] slipWithCondition(String str) {
        String[] result = str.split("[.?!\n]");
        return result;
    }
}
