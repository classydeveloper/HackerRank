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
    public static void main(String[] args) {


    }
}