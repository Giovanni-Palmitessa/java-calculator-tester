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
    @DisplayName("Test for divide numbers")
    void divide() {
        float result = Calculator.divide(10.0f, 5.0f);
        assertEquals(2.0f, result);
        assertNotEquals(3.0f, result);
        assertThrows(IllegalArgumentException.class, () -> Calculator.divide(8.0f, 0.0f));
    }

    @Test
    @DisplayName("Test for multiply numbers")
    void multiply() {
        float result = Calculator.multiply(10.0f, 5.0f);
        assertEquals(50.0f, result);
        assertNotEquals(30.0f, result);
    }
}