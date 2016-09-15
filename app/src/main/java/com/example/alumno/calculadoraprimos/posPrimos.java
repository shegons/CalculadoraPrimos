package com.example.alumno.calculadoraprimos;

/**
 * Created by alumno on 15/09/2016.
 */
public class posPrimos {

    public static int GetPrimeForPosition(int position) {
        int primes = 0;
        int current = 0;

        while (primes != position) {
            current++;
            if (isPrime(current)) {
                primes++;
            }
        }
        return current;
    }

    public static boolean isPrime(int num) {
        if (num == 2)
            return true;
        else if (num < 1 || num % 2 == 0) {
            return false;
        } else {
            long max = (long) Math.sqrt(num);

            for (int i = 3; i <= max; i++) {
                if (num % i == 0) {
                    return false;
                }
            }
            return true;
        }


    }
}
