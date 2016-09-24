package com.algorithms.hackerrank;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by kp on 9/23/16.
 */
public class SimpleMathTest {

    @Test
    public void add() {
        SimpleMath calc = new SimpleMath();

        Assert.assertEquals(10,calc.add(5,5));

        Assert.assertTrue(10!=calc.add(5,4));
    }
    @Test
    public  void subtract() {
        SimpleMath calc = new SimpleMath();

        Assert.assertEquals(5,calc.subtract(10,5));
    }

    @Test
    public  void multiply() {
        SimpleMath calc = new SimpleMath();
        Assert.assertEquals(15,calc.multiply(5,3));
    }
}