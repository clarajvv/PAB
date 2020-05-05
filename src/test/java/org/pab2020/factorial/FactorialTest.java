package org.pab2020.factorial;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

/**
 * class that test our factorial class
 * it checks the most problematic cases, such as:
 * 0 -> 1
 * 1 ->1
 * 2 ->2
 * 4 -> 24 (generico)
 * negativos -> ??
 */
class FactorialTest {
    private Factorial factorial;

    @BeforeEach
    public void setup() {
        factorial = new Factorial();
    } //se ejecuta antes de cada caso de prueba

    @Test
    /**
     * we can write a comment indicating a test's function or make its name descriptive
     */
    public void factorialOf0ShouldReturn1() {
        // longs can store more bits (64) than int (32)
        long expectedValue = 1;
        long obtainedValue = factorial.compute(0);

        assertEquals(expectedValue, obtainedValue);

    }

    @Test
    public void factorial1f0ShouldReturn1() {
        long expectedValue = 1;
        long obtainedValue = factorial.compute(1);

        assertEquals(expectedValue, obtainedValue);
    }

    @Test
    public void factorial2f0ShouldReturn2() {
        long expectedValue = 2;
        long obtainedValue = factorial.compute(2);

        assertEquals(expectedValue, obtainedValue);
    }

    @Test
    public void factorialof4ShouldReturn24() {
        long expectedValue = 24;
        long obtainedValue = factorial.compute(4);

        assertEquals(expectedValue, obtainedValue);
    }
    @Test//creamos un test que pruebe con cualquier número mayor que 20 (pongo 100 de límite)
    public void factorialofBiggerThan20ShouldReturnError() {
        Random r =new Random();
        int val=r.nextInt(100-21)+21;
        assertThrows(RuntimeException.class, () -> factorial.compute(30));
    }
    @Test
    public void factorialofnegativeShouldReturnError() {
        assertThrows(RuntimeException.class, () -> factorial.compute(-1));
    }


}