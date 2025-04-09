package com.sruj.external;
import com.sruj.internal.Mutant;
public class MutantResearch {
    public void studyMutant() {
        Mutant mutant = new Mutant();

        System.out.println("DNA Sample: " + mutant.getDnaSequence());
        System.out.println("Power Reading: " + mutant.getPowerLevel());
        System.out.println("Regeneration Status: " + mutant.isCanRegenerate());
        System.out.println("Mutation Analysis: " + mutant.getMutationRate());
        System.out.println("Place of Origin: " + mutant.getOrigin());

    }

}


