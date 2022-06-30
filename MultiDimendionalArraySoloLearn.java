public class MultiDimendionalArraySoloLearn {
        public static void main(String[] args) {
            int[ ][ ] sample = { {1, 2, 3,7,900}, {4, 5, 6},{13,16,19},{50,100,150},{350,550,850,999} };
            int x = sample[0][4];
            for (int i=0;i<sample.length; i++){
                System.out.print("{");
                for (int j=0; j<sample[i].length; j++){
                    System.out.print(sample[i][j] + ",");
                }
                System.out.println("}");
            }
            System.out.println(x);
        }
}
