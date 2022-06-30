
public class Conversion {
    public static void main(String[] args) {
        long a = 100000L*Integer.MAX_VALUE;
        float b = a;

        int c=6;
        float d=3.2f;
        float e=d*c;


        System.out.println(a);
        System.out.println(b);

        double n = 5147483648.9898;
        int m = (int) n;
        System.out.println(m);


    }
}
