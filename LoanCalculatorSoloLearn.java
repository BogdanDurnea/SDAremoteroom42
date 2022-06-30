import java.util.Scanner;

public class LoanCalculatorSoloLearn {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int amount = scanner.nextInt();
        int months = 3;
        for (int i = 0; i < months; i++)
            amount = amount * 110 / 100;
        System.out.println(amount);
    }
}


