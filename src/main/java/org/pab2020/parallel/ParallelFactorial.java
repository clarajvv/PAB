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
        List<List<Long>> factorialValues;
        //List<Integer> numbers = Arrays.asList(2,3,4,5,6,7,10,20,30,40);

        //List<Long> factorialValues = new ArrayList<>();

        HeavyFactorial factorial = new HeavyFactorial( 500000);
//en paralelo tardo 2s 622 ms, y con stream a secas
        //el tiempo siempre es distinto porque la carga del sistema nunca es la misma

        int numberOfCoresToUse=8;
        System.setProperty("java.util.concurrent.ForkJoinPool.common.parallelisa", "" +numberOfCoresToUse);


        long initTime = System.currentTimeMillis();

        factorialValues=numbers
                .stream()//con parallelStream() esto tarda mucho menos que en stream()
                .filter(number ->(number % 2)==0)//me devuelve números pares
                .map(number -> {//numero y factorial correspondiente
                    System.out.println(number);
                    return List.of(Long.valueOf(number), factorial.compute(number));
                }) //para cada elemento, me transforma el elemento a otro nuevo
                .collect(Collectors.toList()); //deja de inicializarse factorialValues

        /*for(int i=0; i<numbers.size(); i++){
            factorialValues.add(factorial.compute(numbers.get(i)));
        }*/

        /*
        for(Integer number:numbers){
            factorialValues.add(factorial.compute(number));
        }
*/

        long totalTime = System.currentTimeMillis() - initTime;

        System.out.println("Total computing time: " + totalTime);

        for (int i=0; i<factorialValues.size(); i++){
            System.out.println(("Number: "+factorialValues.get(i).get(0) + ". Factorial: "+factorialValues.get(i).get(1)));
        }



    }
}
