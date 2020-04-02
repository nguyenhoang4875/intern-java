package string;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Exer05 {

    public List<String> findDuplicationWords(String str) {
        String[] strings = str.trim().split("\\s+");
        Set<String> stringSet = new HashSet<>();
        Set<String> duplicates = new HashSet<>();

        for (String string : strings) {
            if (!stringSet.add(string)) {
                duplicates.add(string);
            }
        }
        return duplicates.stream().collect(Collectors.toList());
    }
}
