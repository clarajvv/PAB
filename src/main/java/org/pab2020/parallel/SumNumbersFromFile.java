package org.pab2020.parallel;

import java.util.List;

public class SumNumbersFromFile {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5); //3,7,5 // 10,5 //15

        double sum = numbers
                .stream()
                //reduce procesa un stream y genera un solo valor
                .reduce(0, (number1, number2) -> number1 + number2);//usa un valor inicial, va recibiendo pares de valores y los suma

        System.out.println("Sum: " + sum);
    }

}
