package com.acehouhao;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by Hao HOU on 2017/5/16.
 */
public class CalculatorTest {
    @Before
    public void init() {}

    @After
    public void cleanUp() {}

    @Test
    public void testAdd() {
        Calculator calculator = new Calculator();
        int result = calculator.add(5, 8);
        Assert.assertEquals(13, result);
    }

    @Test
    public void testSubtract() {
        Calculator calculator = new Calculator();
        int result = calculator.subtract(5, 8);
        Assert.assertEquals(-3, result);
    }
}
