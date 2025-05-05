package com.java;

interface IntCondition {
    boolean test(int num);
}

class IntFilter {
    public void filterAndPrint(int[] arr, IntCondition condition) {
        for (int num : arr) {
            if (condition.test(num)) {
                System.out.println(num);
            }
        }
    }
}
