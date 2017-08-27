package utils;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Bridge on 2017/8/27.
 *
 *
 */
public class CalculatorTest {

    private Calculator cal = new Calculator();
    @Test
    public void testAdd() throws Exception {
        int a = 1;
        int b = 2;

        int result = cal.add(a,b);
        Assert.assertEquals(result,3);
    }

}