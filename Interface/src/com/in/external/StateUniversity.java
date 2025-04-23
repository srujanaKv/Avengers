package com.in.external;

import com.in.internal.University;

public class StateUniversity implements University {
    @Override
    public void startSemester() {
        System.out.println("Starting new semester at State University");
    }

    @Override
    public void conductLectures() {
        System.out.println("Conducting lectures at State University");
    }

    @Override
    public void holdExams() {
        System.out.println("Holding exams at State University");
    }

    @Override
    public void evaluatePapers() {
        System.out.println("Evaluating papers at State University");
    }

    @Override
    public void publishResults() {
        System.out.println("Publishing results at State University");
    }

    @Override
    public void organizeFest() {
        System.out.println("Organizing cultural fest at State University");
    }

    @Override
    public void closeSemester() {
        System.out.println("Closing semester at State University");
    }
}
