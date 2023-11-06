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
    }

    @Test
    void subtract() {
    }

    @Test
    void divide() {
    }

    @Test
    void multiply() {
    }
}