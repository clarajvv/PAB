package org.pab2020.factorial;
public class HeavyFactorial extends Factorial {

    private long iterations ;

    public HeavyFactorial() {
        this(100000) ;
    }

    public HeavyFactorial(long iterations) {
        this.iterations = iterations ;
    }

    @Override
    public long compute(long value) {
        for (long i = 0 ; i < iterations; i++) {
            double dummy = Math.sin(2.352 +i) * Math.cos(i - 0.235) ;
        }

        return super.compute(value) ;
    }
}