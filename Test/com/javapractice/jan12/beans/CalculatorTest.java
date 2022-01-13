package com.javapractice.jan12.beans;

import junit.framework.TestCase;

public class CalculatorTest extends TestCase {

    public void testAdd() {
        Calculator calculator = new Calculator(3, 4);
        int addResult = calculator.add();
        assertEquals(7, addResult);
    }

    public void testSubtract() {
        Calculator calculator = new Calculator(4, 3);
        int subtractResult = calculator.subtract();
        assertEquals(1, subtractResult);
    }
}