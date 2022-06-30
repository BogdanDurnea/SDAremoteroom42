package ro.sda.java42;

public class ArrayExample {
    public static void main(String[] args) {
        int dimension=4;
        String[] names = new String[dimension];
        names[0] = "Jan";
        names[3] = "roman";
        System.out.println("Element number 1: " + names[0]); // Element number 1: Jan
        System.out.println("Element number 2: " + names[1]); // Element number 2: null
        System.out.println("Element number 3: " + names[2]); // Element number 3: null
        System.out.println("Element number 4: " + names[3]); // Element number 4: roman
        String[] sentence= new String[]{"Hello", "world", "!"};
        System.out.println(sentence[1]); //world
        System.out.println("============ Iteration on arrays ===========");
        for(int i=0; i<dimension; i++){
            System.out.println(names[i]);
        }
        System.out.println("============ Iteration on arrays foreach ===========");
        for (String elem: names){
            System.out.println(elem);
        }
    }
}
