package com.java;

import java.util.Scanner;

public class Conditions {
    public static void main(String[] args) {


     //   int a = 80;
      //  int b = 90;

      //  if (a > 50 || b < 50) {
         //   System.out.println("atleast one greater then 50");


       /* boolean isAdult = true;
        if (isAdult==true){     //here ! symbol can be used for not adult statement
            System.out.println("is adult");}
            else{
                System.out.println("not adult");
            }   */


        Scanner sc=new Scanner(System.in);
        int cash=sc.nextInt();

        if(cash<30){
            System.out.println("cannot buy anything");
        }
       else if(cash>30 && cash<80){
            System.out.println("both can buy");
        }
       else {
            System.out.println("any one can get");
        }

        }
    }




