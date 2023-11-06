package org.lessons.java;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    @DisplayName("Test for add numbers")
    void add() {
        float result = Calculator.add(5,3);
        assertEquals(8.0f, result);
        assertNotEquals(11.0f, result);
    }

    @Test
    @DisplayName("Test for subtract numbers")
    void subtract() {
        float result = Calculator.subtract(10.5f, 6.5f);
        assertEquals(4.0f, result);
        assertNotEquals(10.5f, result);
    }

    @Test
    void divide() {
    }

    @Test
    void multiply() {
    }
}