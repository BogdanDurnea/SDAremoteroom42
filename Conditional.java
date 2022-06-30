
public class Conditional {
    public static void main(String[] args) {
        float temperature = 37.5f;
        if (temperature > 39.6f) {

            System.out.println("Please see a doctor!");
        } else if (temperature > 36.5f) {
            System.out.print("You have a fever!");
        } else {
            System.out.println("You are fine!");
            System.out.println("Bring me a beer!");
        }


    }
}
