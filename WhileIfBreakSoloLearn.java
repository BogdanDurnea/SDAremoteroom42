public class WhileIfBreakSoloLearn {
    public static void main(String[] args) {
        int x = 10;

        while(x > 0) {
            System.out.println(x);
            if(x == 15) {
                break;
            }
            x++;
        }
    }
}