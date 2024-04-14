package com.thealgorithms.maths;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class FactorialRecursionTest {

    @Test
    public void testFactorial() {
        assertEquals(1, FactorialRecursion.factorial(0));
        assertEquals(1, FactorialRecursion.factorial(1));
        assertEquals(2, FactorialRecursion.factorial(2));
        assertEquals(6, FactorialRecursion.factorial(3));
        assertEquals(120, FactorialRecursion.factorial(5));
    }

    @Test
    public void testFactorialWithNegativeNumber() {
        assertThrows(IllegalArgumentException.class, () -> {
            FactorialRecursion.factorial(-1);
        });
    }
}