package array;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Exer02 {

    public int sumThreeNumberGreatestOfArray(int[] array) {
        List<Integer> list = IntStream.of(array).boxed().sorted(Comparator.reverseOrder()).limit(3).collect(Collectors.toList());
        return list.stream().mapToInt(Integer::intValue).sum();
    }
}
