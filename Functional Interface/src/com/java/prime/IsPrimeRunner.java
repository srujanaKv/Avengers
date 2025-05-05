package com.java.prime;

public class IsPrimeRunner {
    public static void main(String[] args) {
        IsPrime prime = (number) -> {
            if (number<= 1) {
                System.out.println("not a prime number");
                return;
            }

            boolean primeNo = true;
            for (int i = 2; i < number; i++) {
                if (number % i == 0) {
                    primeNo = false;
                    break;
                }
            }

            if (primeNo) {
                System.out.println("prime");
            } else {
                System.out.println("not prime");
            }
        };

        prime.checkIsPrime(4);
    }
}


