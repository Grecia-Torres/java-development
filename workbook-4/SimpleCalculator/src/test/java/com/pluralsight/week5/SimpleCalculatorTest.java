package com.pluralsight.week5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SimpleCalculatorTest {
    @Test
    public void positiveNumbers() {
        assertEquals(6.0,SimpleCalculator.addTwoNumbers(2.0,4.0));
    }
    @Test
    public void positiveNegativeNumbers() {
        assertEquals(-8.0,SimpleCalculator.addTwoNumbers(-10.0,2.0));
    }
}