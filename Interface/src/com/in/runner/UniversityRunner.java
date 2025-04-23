package com.in.runner;

import com.in.external.StateUniversity;
import com.in.internal.University;

public class UniversityRunner {
    public static void main(String[] args) {
        University uni = new StateUniversity();
        StateUniversity su = new StateUniversity();

        uni.startSemester();
        uni.conductLectures();
        uni.holdExams();
        uni.evaluatePapers();
        uni.publishResults();
        uni.organizeFest();
        uni.closeSemester();

        su.startSemester();
        su.conductLectures();
        su.holdExams();
        su.evaluatePapers();
        su.publishResults();
        su.organizeFest();
        su.closeSemester();
    }
}
