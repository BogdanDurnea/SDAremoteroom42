import java.util.Scanner;

public class Clasa2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("What it is your name? ");
        String name = scan.nextLine();
        System.out.print("Where are you from?");
        String tara = scan.nextLine();
        System.out.print("How old are you? ");
        int varsta = scan.nextInt();
        System.out.print("Do you have good time?");
        boolean haveFun = scan.nextBoolean();
        scan.nextLine();
        System.out.print("Wanna buy a car?");
        String Limousine = scan.nextLine();
        if (Limousine.equalsIgnoreCase("true")) {
            System.out.println("Go dealership!");
        } else {
            System.out.println("Dont waste you money");


            }
        }


    }





