package com.kevery.algorithm.page110;

import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {

    @Test
    public void convertBehind() {
        String s = Calculator.convertBehind("9+(3-1)*3+10/2");
        Assert.assertEquals("931-3*+102/+", s);
    }

    @Test
    public void isNum() {
        boolean num = Calculator.isNum('4');
        Assert.assertEquals(true, num);
    }

    @Test
    public void isLeft() {
    }

    @Test
    public void isRight() {
    }

    @Test
    public void isHigh() {
//        boolean high = Calculator.isHigh('*', '-');
//        Assert.assertEquals(true, high);
    }
}