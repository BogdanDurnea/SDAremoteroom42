package ro.sda.java42.staticExemple;

import ro.sda.java42.staticExemple.Exemplu;

public class ExempluAplicatie {

    public static void main(String[] args) {
        Exemplu instanta1 = new Exemplu();
        Exemplu.afisareNumarInstanteCreate();
        Exemplu instanta2 = new Exemplu();
        Exemplu.afisareNumarInstanteCreate();
        Exemplu instanta3 = new Exemplu();
        Exemplu.afisareNumarInstanteCreate();
        Exemplu instanta4 = null;
        Exemplu.afisareNumarInstanteCreate();
        instanta4 = new Exemplu();
        instanta4 = new Exemplu();
        Exemplu.afisareNumarInstanteCreate();

    }

}
