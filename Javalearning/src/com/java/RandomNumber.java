package com.java;

import java.util.Scanner;

public class RandomNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int Mynumber = (int) (Math.random() * 100);

        do {
            System.out.println("guess my number:1-50");
            int userNumber = sc.nextInt();

            if (userNumber == Mynumber) ;

            System.out.println("wohhoooo your guess is correct");


            while (userNumber >= 0) {
                System.out.println("my number is:");
                System.out.println(Mynumber);
                break;
            }

            if (userNumber > Mynumber) {
                System.out.println("number is large");
            } else {
                System.out.println("number is small");
            }
            // while (userNumber >= 0) {
            //   System.out.println("my number is:");
            //  System.out.println(Mynumber);
        }
    }
}

