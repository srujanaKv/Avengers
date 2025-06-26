package com.java;

import java.util.Scanner;

public class Conditionstatement {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter age");
        int age=scanner.nextInt();

        if(age>18){
            System.out.println("you are an adult");
        }
        else{
            System.out.println("you are not an adult");
        }
    }
}
