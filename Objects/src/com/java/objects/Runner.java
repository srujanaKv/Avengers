package com.java.objects;

import com.java.objects.internal.Binocular;
import com.java.objects.internal.Corn;

import java.util.Objects;
public class Runner {
    public static void main(String[] args) {

        System.out.println("Corn is running");

        Corn corn=new Corn("Sweetcorn","yellow",10,true);
        Corn corn1=new Corn("butter","yellow",15,false);
        Corn corn2=new Corn("Sweetcorn","yellow",10,true);

        System.out.println("Corn is not matching:"+corn.equals(corn2));
        System.out.println("Corn is matching:"+corn2.equals(corn1));


        System.out.println("...........................");
        Binocular binocular=new Binocular("Nikon","grey",15000,500);
        Binocular binocular1=new Binocular("Krevia","black",10000,600);
        Binocular binocular2=new Binocular("Nikon","grey",15000,500);

        System.out.println("Binocular is matching:"+binocular.equals(binocular2));
        System.out.println("binocular is not matching:"+binocular1.equals(binocular));

    }
}
