package com.java.internal.hulk.external68;

import com.java.internal.hulk.internal68.Hulk;
import com.java.internal.hulk.internal68.ProfessorHulk;

public class HulkShowdown {

    public void display(Hulk hulk) {
        if (hulk != null) {
            hulk.Smash();
            if (hulk instanceof ProfessorHulk) {
                ProfessorHulk professor = (ProfessorHulk) hulk;
                professor.Think();
            }
        } else {
            System.out.println("No Hulk to display.");
        }
    }
}