package org.pab2020.parallel;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class SumNumbersWithCriticalSection {
    public static void main(String[] args) throws IOException {
        long initTime = System.currentTimeMillis() ;

        int numberOfMaps = 0 ;//lo creamos solo para prueba
        //no podemos modificar variables fuera del stream, pero sí leerlas.

        double sum = Files
                .lines(Paths.get("data/numbers.txt"))
                .parallel()
                .map(line -> {
                    // no podemos hacer numberOfMaps = numberOfMaps + 1 ; porque estamos accediendo a escritura de una variable dentro de un map
                    //como se está hacienod en paralelo, tenemos modificaciones en 8 cores, no se garantizza que si se hace una modificación el solapamiento no haga que se llegue a resultados incorrecto

                    return Integer.valueOf(line);
                })
                .reduce(0, (number1, number2) -> number1 + number2) ;

        long totalTime = System.currentTimeMillis() - initTime ;

        System.out.println("Total computing time: " + totalTime + " milliseconds") ;

        System.out.println("Sum " + sum) ;
    }
}