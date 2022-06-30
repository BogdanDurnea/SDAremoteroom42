import java.util.Scanner;

public class Something {

    public static void main(String[] args) {

        System.out.println("INTRODUCETI NUMELE");
        Scanner scan = new Scanner(System.in);
        String nume = scan.nextLine();

        if (nume.equalsIgnoreCase("exit")) ;
        {

            System.out.println(concatenareVariabila(nume));
        }

    }

    private static String concatenareVariabila(String nume) {
        return "Something ".concat(nume);
    }
}
