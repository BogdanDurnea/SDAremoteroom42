

public class LoopFor2 {
    public static void main(String[] args) {
        String[] array = {"Alice", "has", "a", "cat"};

        for (String element: array) {
            System.out.println(element + " ");
        }

        for (int i=0; i< array.length; i++){
            System.out.println(array[i]);
        }

        for (int i=1; i<20; i=i+5){
            System.out.println(i);
        }
    }
}
