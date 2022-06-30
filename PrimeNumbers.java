package com.sda;

public class PrimeNumbers {

    public static void main(String[] args) {

        int n = 0; // n este numarul ce vrem sa verficam dacă este prim sau nu
        int count = 0;
        int m = 1230; // al catalea numar prim il cautam
        do {
            int half = n / 2;
            int conditie_prim = 0; // conditie ca numarul n sa fie prim este ca ea sa fie zero
            if (n == 0 || n == 1) {
                conditie_prim = 1; // adica nr 1 si nr 2 nu sunt prime
            } else {
                for (int i = 2; i <= half; i++)
                    if (n % i == 0) {
                        conditie_prim = 1;
                        break;
                    }
            }
            if (conditie_prim == 0) {
//                System.out.println("numarul " + n + " este numar prim");
                count++;
                if (count == m) {
                    System.out.println("al " + m + " lea numar prim este " + n);
                }

            }
            n++;

        } while (n <= 10*m);
        System.out.println("in primele " + (n - 1) + " de numere exista " + count + " numere prime");

    }

}
