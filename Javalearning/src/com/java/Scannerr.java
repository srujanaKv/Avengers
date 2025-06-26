package com.java;

import java.util.Scanner;
public class Scannerr {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String name=sc.nextLine();
        int age=sc.nextInt();
        int b=sc.nextInt();
        int sum=age+b;
        System.out.println(sum);
    }
}
