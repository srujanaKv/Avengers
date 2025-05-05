package com.java;

public class StringLengthRunner {
    public static void main(String[] args) {
        String[] words = {"cat", "elephant", "dog", "giraffe", "lion"};

        int minLength = 4;

        StringLengthFilter filter = new StringLengthFilter();

        filter.filterAndPrint(words, str -> str.length() > minLength);
    }
}