
public class LoopContinueFor {
        public static void main(String[] args) {
            for (int i =0; i<5; i++){
                if (i%2==1){
                    continue;
                }
                System.out.println("========================== i=" + i);
                for (int j= 0; j<5; j++){
                    if (j%2==0) {
                        System.out.println("J=" + j);
                    }
                    if (j>2){
                        break;
                    }
                }

            }
        }

}
