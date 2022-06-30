
public class LoopWhile {
    public static void main(String[] args) {
        int i = 11;
        while (i <= 10) {
            System.out.println(i);
            ++i;
        }
        System.out.println("===========================================");
        i=11;
        do {
            System.out.println(i);
            i++;
        }while (i<=10);
    }
}
