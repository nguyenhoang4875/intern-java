package string;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;

public class Exer05Test {

    @Test
    public void test_findDuplicationWords() {
        Assert.assertEquals(new Exer05().findDuplicationWords("a b c d e a b"), Arrays.asList("a", "b"));
        Assert.assertEquals(new Exer05().findDuplicationWords("we need to find out the duplicate words present in the string and display those words"), Arrays.asList("the", "words"));
        Assert.assertEquals(new Exer05().findDuplicationWords("we first split the string into words"), Collections.emptyList());
    }
}
