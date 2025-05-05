package com.java;

public class StringFormatRunner {
    public static void main(String[] args) {
        String[] names = {"Alice", "Bob", "Charlie", "David"};

        StringFormat format = new StringFormat();

        System.out.println("Uppercase:");
        format.applyFormat(names, str -> str.toUpperCase());

        System.out.println("\nLowercase:");
        format.applyFormat(names, str -> str.toLowerCase());

        System.out.println("\nCustom (add 'Mr./Ms.' prefix):");
        format.applyFormat(names, str -> "Mr./Ms. " + str);
    }
}