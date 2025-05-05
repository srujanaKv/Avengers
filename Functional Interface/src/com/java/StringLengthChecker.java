package com.java;

interface StringLengthChecker {
    boolean check(String str);
}

class StringLengthFilter {
    public void filterAndPrint(String[] arr, StringLengthChecker checker) {
        for (String s : arr) {
            if (checker.check(s)) {
                System.out.println(s);
            }
        }
    }
}