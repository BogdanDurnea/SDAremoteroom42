public class StringExample {
    public static void main(String[] args) {
        String text1 = "This is a test";
        String text2 = new String("This is a test");

        String val1= text1.intern();
        String val2 = text2.intern();
        System.out.println( val1==val2);
        System.out.println(val1.equals(val2));

        System.out.println(text1==text2);
        System.out.println(text1.equals(text2));

        String text3 = "This is ";
        String text4 = "a test";
        String finalText2 = text3.concat(text4);
        System.out.println(finalText2);
        String[] values;
        for(String arg: args){
            System.out.println(sayHello(arg));
        }
        String compare1="Ana Are Mere";
        String compare2="Ana are mere";
        System.out.println(compare1.equals(compare2));
        System.out.println(compare1.equalsIgnoreCase(compare2));
        System.out.println(compare1.toUpperCase());
        System.out.println(compare2.toLowerCase());

        String testValue = "This is test value";
        System.out.println(testValue.indexOf("is"));
        System.out.println(testValue.lastIndexOf("is"));

        String text = "Hahahah! Funny joke!";
        System.out.println(text.replaceAll("a", "o"));
        System.out.println(text.replace("a", "o"));
    }

    public static String sayHello(String name){
        return "Hello " + name +"!";
    }
}
