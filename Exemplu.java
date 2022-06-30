package ro.sda.java42.staticExemple;

import javax.swing.plaf.IconUIResource;

public class Exemplu {

    static int contor = 0;

    /**
     * Constructor
     */
    public  Exemplu() {
        ++contor;
    }

    /**
     * Metoda care afiseaza un numar
     */
    public static void afisareNumarInstanteCreate(){
        System.out.println("Au fost create " + contor + " instante");

    }

}
