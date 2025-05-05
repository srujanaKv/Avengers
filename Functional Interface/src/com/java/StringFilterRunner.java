package com.java;

public class StringFilterRunner {
    public static void main(String[] args) {
        String[] words = {"apple", "banana", "avocado", "berry", "apricot"};

        StringFilter sf = new StringFilter();

        sf.filterAndPrint(words, new StringChecker() {
            @Override
            public boolean check(String str) {
                return str.startsWith("a");
            }
        });
    }
}