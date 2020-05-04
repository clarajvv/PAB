package org.pab2020.factorial;

public class HeavyFactorial extends Factorial {

    @Override
    public long compute(long value) {
        for (long i = 0; i < 5000000; i++) {
            double dummy = Math.sin(2.334) * Math.cos(i - 0.23);
        }

        return super.compute(value);
    }
}
