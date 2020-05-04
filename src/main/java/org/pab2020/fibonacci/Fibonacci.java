package org.pab2020.fibonacci;

public class Fibonacci {
    public long compute(int months, int offspring) {
        int pairs = 1;
        int prev1 = 1;
        int prev2 = 0;
        for (int i = 1; i < months; i++) {
            pairs = prev1 + prev2 * offspring;
            prev2 = prev1;
            prev1 = pairs;
            //System.out.println(pairs);

        }
        return pairs;
    }

}
