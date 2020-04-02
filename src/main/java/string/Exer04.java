package string;

import java.util.HashSet;
import java.util.Set;

public class Exer04 {

    public boolean checkDuplicationString(String str) {
        Set<Character> setStr = new HashSet<>();

        for (int i = 0; i < str.length(); i++) {
            if (!setStr.add(str.charAt(i))) {
                return true;
            }
        }
        return false;
    }
}
