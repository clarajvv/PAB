package org.pab2020.parallel;

import org.pab2020.factorial.Factorial;
import org.pab2020.factorial.HeavyFactorial;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * class to compute the factorial of a list of numbers
 *
 * @author Clara Jiménez
 */

public class ParallelFactorial {
    public static void main(String[] args1){
        List<Integer> numbers = List.of(2,3,4,5,6,7,10,20,30,40);
        //List<Integer> numbers = Arrays.asList(2,3,4,5,6,7,10,20,30,40);

        List<Long> factorialValues = new ArrayList<>();

        HeavyFactorial factorial = new HeavyFactorial();

        long initTime = System.currentTimeMillis();

        factorialValues=numbers
                .parallelStream()
                .map(number -> factorial.compute(number)) //para cada elemento, me transforma el elemento a otro nuevo
                .collect(Collectors.toList());

        /*for(int i=0; i<numbers.size(); i++){
            factorialValues.add(factorial.compute(numbers.get(i)));
        }*/


        long totalTime = System.currentTimeMillis();

        System.out.println("Total computing time: " + totalTime);

        for (int i=0; i<factorialValues.size(); i++){
            System.out.println(("Number: "+numbers.get(i) + ". Factorial: "+factorialValues.get(i)));
        }


    }
}
