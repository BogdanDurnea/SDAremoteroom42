public class StandardIo {
    public static void main(String[] args) {
        System.out.printf("100.0 / 3.0 = %5.2f", 100.0 / 3.0); // the result will be a floating point number consisting of 5 characters and 2 digits after the decimal point
        System.out.println();
        System.out.printf("100 / 3 = %4d", 100 / 3); // the result will be an integer occupying 4 characters - the result of the division will be rounded off
        System.out.println();
        System.out.printf("100 / 3 = %4x", 100 / 3); // the result will be an integer occupying 4 characters - the result of the division will be rounded off
        System.out.println();
        System.out.printf("100 / 3 = %4o", 100 / 3); // the result will be an integer occupying 4 characters - the result of the division will be rounded off
        System.out.println();
//        System.out.printf("100.0 / 3.0 = %5.2e", 100.0 / 3.0);
//        Scanner scan = new Scanner(System.in);
//        while (true) {
//            System.out.println("Introduceti un text:");
//            String textLine = scan.nextLine();
//            if("exit".equalsIgnoreCase(textLine)){
//                break;
//            }
//            sayHello(textLine);
//        }
    }

    public static void sayHello(String param){
        System.out.println("Hello " + param);
    }
}
