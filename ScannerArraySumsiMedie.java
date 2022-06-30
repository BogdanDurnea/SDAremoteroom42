import java.util.Scanner;

public class ScannerArraySumsiMedie {
    public static void main(String[] args) {
        Scanner scanaj = new Scanner(System.in);
        System.out.println(" Cate numere vrei sa aiba array-ul?");
        int catenumere =scanaj.nextInt();
        int[] domeniu = new int[catenumere];

        for (int i = 0; i < catenumere; i++) {
            System.out.println("Introduceti elementul " + (i+1) + ":");
            domeniu[i] = scanaj.nextInt();

        }
        int suma = 0;
        for (int j = 0; j < domeniu.length; j++) {
//            System.out.println(domeniu[j]);
            suma = suma+ domeniu[j];
        }
//
            System.out.println("Suma este :" + suma);
        float medie =  (float) suma / catenumere;
        System.out.println("Media este : " +medie);






}
}
