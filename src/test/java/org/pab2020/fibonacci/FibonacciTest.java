package org.pab2020.fibonacci;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FibonacciTest {
    private Fibonacci fibonacci;

    @BeforeEach
    public void setup() {
        fibonacci = new Fibonacci();
    }

    @Test
    public void fibonacciOf5months3pairsShouldBe19() {
        long expectedValue = 19;
        long obtainedValue = fibonacci.compute(5, 3);

        assertEquals(expectedValue, obtainedValue);
    }

    @Test
    public void fibonacciOf5months1pairShouldBe5() {
        long expectedValue = 5;
        long obtainedValue = fibonacci.compute(5, 1);

        assertEquals(expectedValue, obtainedValue);
    }
    @Test
    public void fibonacciOf8months1pairShouldBe21() {
        long expectedValue = 21;
        long obtainedValue = fibonacci.compute(8, 1);

        assertEquals(expectedValue, obtainedValue);
    }
    @Test
    public void fibonacciOf6months2pairsShouldBe21() {
        long expectedValue = 21;
        long obtainedValue = fibonacci.compute(6, 2);

        assertEquals(expectedValue, obtainedValue);
    }
}
