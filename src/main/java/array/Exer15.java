package array;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Exer15 {

    public List<Integer> reduceArray(int[] array, int k) {
        List<Integer> result = new ArrayList<>();
        if (k <= 0) {
            return result;
        }
        result = IntStream.of(array).boxed().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        if (k >= array.length) {
            return result;
        }
        return result.stream().limit(k).collect(Collectors.toList());
    }
}
