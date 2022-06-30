package ro.sda.java42;

public class MatriceExample {
    public static void main(String[] args) {
        String[][] myArray = new String[2][];
        myArray[0] = new String[]{"Alice", "has", "the", "cat"}; // creating the first row (index number 0)
        myArray[1] = new String[]{"The", "cat", "has", "Alice"};
//        System.out.println(myArray);
        for (int i = 0; i < myArray.length; i++) {
            for (int j = 0; j < myArray[i].length; j++) {
                System.out.print(myArray[i][j] + " ");
            }
            System.out.println();
        }
    }
}
