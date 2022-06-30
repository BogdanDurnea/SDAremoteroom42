package ro.sda.java42;

public class MyOuterClass {
    protected static int outerNumber = 5;

    public static class MyInnerClass {
        public void printNumber() {
            System.out.println(outerNumber);
        }
    }

    public MyInnerClass init() {
        return new MyInnerClass();  // = this.new MyInnerClass()
    }
}