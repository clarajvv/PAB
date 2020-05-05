package org.pab2020.parallel;

import javax.imageio.stream.FileImageInputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class SumNumbersFromFile {
    public static void main(String[] args) throws IOException {
        long initTime=System.currentTimeMillis();

        double sum = Files
                .lines(Paths.get("data/numbers.txt")) //me da la línea del fichero como cadena de caracteres
                .parallel()
                //convierto cada línea a entero
                .map(Integer::valueOf)

                .reduce(0, (number1, number2) -> number1 + number2);//usa un valor inicial, va recibiendo pares de valores y los suma

        long totalTime=System.currentTimeMillis() - initTime;

        System.out.println("Total computing time: "+ totalTime + "milliseconds");;

        System.out.println("Sum: "+ sum);
    }


}
