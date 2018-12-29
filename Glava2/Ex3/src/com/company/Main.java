package com.company;

import exercise11.AllTheColorsOfTheRainbow;
import exercise3.ATypeName;
import exercise4and5.DataOnly;
import exercise6.Ex6;
import exercise7.Incrementable;
import exercise9.Exercise9;
import exersice8.Exersice8;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //упражнение 3
        System.out.println("Результат выполения упражнения 3");
        ATypeName aTypeName = new ATypeName();
        aTypeName.vivod();

        //упражнения 4,5
        DataOnly dataOnly = new DataOnly();
        dataOnly.vivod();

        //Упражнение 6
        System.out.println("Результат выполнения упражнения 6");
        Ex6 ex6 = new Ex6();
        System.out.println(ex6.storage("server"));

        //Упражнение 7
        System.out.println("Результат выполнения упражнения 7");
        Incrementable.increment();

        //Упражнение 8
        System.out.println("Результат выполнения упражнения 8");
        Exersice8 exersice8 = new Exersice8();
        exersice8.ex8();

        //Упражнение 9
        System.out.println("Результат выполнения упражнения 9");
        Exercise9 exercise9 = new Exercise9();
        exercise9.vivod();

        //Упражнение 10
        System.out.println("Результат выполнения упражнения 10");
        args = new String[3];
        for(int i=0;i<3;i++){
            System.out.println(args[i]);
        }

        //Упражнение 11
        System.out.println("Результат выполнения упражнения 11");
        AllTheColorsOfTheRainbow n = new AllTheColorsOfTheRainbow();
        n.changeTheHueOfTheColor(5);




    }
}
