package ro.sda.java42;

public class MethodsExample {
    public static void main(String[] args) {
        String[] exemple= new String[10];
        System.out.println("======================");
        unlimitedArgs();
        System.out.println("======================");
        unlimitedArgs("Test 1 parameter");
        System.out.println("======================");
        unlimitedArgs(new String[]{"Parametru 1","Parametrul 2"});
        System.out.println("======================");
        unlimitedArgs("Ana are", "mere");
        for (int i=0; i<10; i++){
            exemple[i]="" +i;
        }
        System.out.println("======================");
        unlimitedArgs(exemple);

        System.out.println(testConversion());
        testVoid(false);
        testVoid(true);
        String outcomeOfMethod = testReturnObject(false);
        MethodsExample obj= new MethodsExample();
        System.out.println(obj.calculateArea(4,7));
    }

    public static void unlimitedArgs(String... info){
        if (info == null || info.length==0){
            System.out.println("Nothing to print");
        }
        for(int i=0; i<info.length; i++){
            System.out.println(info[i]);
        }
    }

    public static int testConversion(){
        byte result=9;
        for (int i=0; i<15; i++){
            result +=  9;
        }
        return  result;
    }

    public static void testVoid(boolean testCondition){
        if (testCondition){
            return;
        }
        System.out.println("Test void");
    }


    public static String testReturnObject(boolean testCondition){
        if (testCondition){
            return null;
        }
        System.out.println("Test void");
        return "Test void";
    }

    public String calculateArea(int diag1, int diagonala2){
        return "Te-am pacalit!";
    }


}
