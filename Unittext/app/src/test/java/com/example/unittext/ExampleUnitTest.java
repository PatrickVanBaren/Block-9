package com.example.unittext;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ExampleUnitTest {

    public SimpleCalculator simpleCalculator;

    @Before
    public void init() {
        simpleCalculator = new SimpleCalculator();
    }

    @Test
    public void sumText() {
        Assert.assertEquals("Failed", 10, simpleCalculator.sum(5, 5));
    }

    @Test
    public void diffTest() {
        Assert.assertEquals("Failed", 0, simpleCalculator.sum(5, 5));
    }

    @Test
    public void multiplyText() {
        Assert.assertEquals("Failed", 25, simpleCalculator.sum(5, 5));
    }

    @Test
    public void divText() {
        Assert.assertEquals("Failed", 1, simpleCalculator.sum(5, 5));
    }
}