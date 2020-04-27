package org.pab2020.factorial;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * class that test our factorial class
 * it checks the most problematic cases, such as:
 * 0 -> 1
 * 1 ->1
 * 2 ->2
 * 4 -> 24 (genérico)
 * negativos -> ??
 */
class FactorialTest {
    private Factorial factorial;

    @BeforeEach
    public void setup(){
        factorial=new Factorial();
    }
    @Test
    /**
     * we can write a comment indicating a test's function or make its name descriptive
     */
    public void factorialOf0ShouldReturn1() {
        Factorial factorial = new Factorial();

        // longs can store more bits (64) than int (32)
        long expectedValue = 1;
        long obtainedValue= factorial.compute(0);

        assertEquals(expectedValue, obtainedValue);

    }

    @Test
    public void factorial1f0ShouldReturn1() {
        Factorial factorial = new Factorial();

        long expectedValue = 1;
        long obtainedValue= factorial.compute(1);

        assertEquals(expectedValue, obtainedValue);

    }

    @Test
    public void factorial2f0ShouldReturn2() {
        Factorial factorial = new Factorial();

        long expectedValue = 2;
        long obtainedValue= factorial.compute(2);

        assertEquals(expectedValue, obtainedValue);

    }

    @Test
    public void factorialof4ShouldReturn24() {
        Factorial factorial = new Factorial();

        long expectedValue = 24;
        long obtainedValue= factorial.compute(4);

        assertEquals(expectedValue, obtainedValue);

    }
    @Test
    public void factorialofnegativeShouldReturnError() {
        assertThrows(RuntimeException.class, () -> factorial.compute( -1));
    }

}