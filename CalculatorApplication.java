package ro.sda.java42.staticExemple;

import ro.sda.java42.Calculator;

public class CalculatorApplication {
    public static void main(String[] args) {
        //Calculam suma lui 5+3 si afisam
        int a = 5;
        int b = 3;
        int suma = Calculator.add(a,b);
        System.out.println(Calculator.add(a,b));
        System.out.println(suma);




        //Calculam suma lui 5,2 si 9,99
        System.out.println(Calculator.add(5.2,9.99));
        System.out.println(0.00);
    }
}
