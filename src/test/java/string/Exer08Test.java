package string;

import org.junit.Assert;
import org.junit.Test;

public class Exer08Test {

    @Test
    public void test_checkBarcodeEAN13(){
        Assert.assertEquals(new Exer08().checkBarcodeEAN13("8938505974194"),true);
        Assert.assertEquals(new Exer08().checkBarcodeEAN13("8938505974193"),false);
    }
}
