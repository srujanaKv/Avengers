package com.java;

interface SubstringChecker {
    boolean contains(String str);
}

class SubstringFilter {
    public void filterAndPrint(String[] arr, SubstringChecker checker) {
        for (String s : arr) {
            if (checker.contains(s)) {
                System.out.println(s);
            }
        }
    }
}