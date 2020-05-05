package org.pab2020.factorial;


/**
 * This class implements a method to compute the factorial of an integer number
 *
 * @author Clara Jiménez
 */
public class Factorial {
    //he comprobado que a partir de 20 el resultado no es correcto
    public long compute(long value) {
        long result;
        if (value < 0) {
            throw new RuntimeException("El número no puede ser negativo");
        } else if ((value == 0) || (value == 1)) {
            result = 1;
        } else if (value<20){
            // Computacionalmente mejor usar un for
            //result = value * compute(value-1);
            result = 1;
            for (int i = 1; i <= value; i++) {
                result = i * result;
            }
        } else{
            throw new RuntimeException("El número es demasiado grande");
        }
        return result;

    }
}
