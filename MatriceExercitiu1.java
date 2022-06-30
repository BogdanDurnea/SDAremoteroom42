package com.example.helloworld;

import java.util.Scanner;

public class MatriceExercitiu1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Introduceti dimensiunea Array:");
        int dimensiune = scan.nextInt();
        int[] array = new int[dimensiune];

        for (int i = 0; i < dimensiune; i++) {
            System.out.println("Introduceti elementul " + i + ":");
            array[i] = scan.nextInt();
        }

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);

        }
        int sum = 0;
        for (int i = 0; i < dimensiune; i++) {
            sum = sum + array[i];


        }
        System.out.println("Afiseaza suma elementelor din array este" + sum);

        int i = 0;
        //int minim=Integer.MAX_VALUE;
        int minim = array[i];
        while (i < array.length) {

            if (minim > array[i]) {
                minim = array[i];
            }
            i++;
        }
        System.out.println("Valoarea minima este:" + minim);
        double medie=(double)sum/ array.length;
        System.out.println("media este:" +medie);
    }
}
