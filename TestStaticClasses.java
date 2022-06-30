package ro.sda.java42;

public class TestStaticClasses {
    public static void main(String[] args) {



        MyPrinter.printNumber(70);

        //Instantiem
        MyPrinter object= new MyPrinter();
        object.printNumber(90);

        //Instantiem cu un obiect null
        MyPrinter object2 = null;
        object2.printNumber(127);

        MyOuterClass outerClass = new MyOuterClass();
        MyOuterClass.MyInnerClass innerClassA = new MyOuterClass.MyInnerClass(); //Nu functioneaza


        MyOuterClass.MyInnerClass innerClass = new MyOuterClass.MyInnerClass();
        MyOuterClass.MyInnerClass innerClass1 = outerClass.init();
        innerClass1.printNumber();
        MyOuterClass.outerNumber=7;
        innerClass1.printNumber();
        innerClassA.printNumber();
        outerClass.outerNumber=11;
        innerClass.printNumber();
        System.out.println(MyOuterClass.outerNumber); //5 5 11

        System.out.println(StaticFieldExample.myStaticNumber);              // (1)


//        System.out.println(StaticFieldExample.myNumber);                    // Compilation error - attempt to refer to a non-static field!

        StaticFieldExample staticFieldExample = new StaticFieldExample();

        System.out.println(staticFieldExample.myNumber);


    }
}
