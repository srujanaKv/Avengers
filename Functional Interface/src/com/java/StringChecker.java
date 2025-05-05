package com.java;

interface StringChecker {
    boolean check(String str);
}

class StringFilter {
    public void filterAndPrint(String[] arr, StringChecker checker) {
        for (String s : arr) {
            if (checker.check(s)) {
                System.out.println(s);
            }
        }
    }
}