   public class HundredthPrime
   {
      public static void main(String[] args) {

         int n = 2; // n este numarul ce vrem sa verficam dacă este prim sau nu
         int count = 1;
         int m = 100; // al catalea numar prim il cautam
         do {
            n++;
            int half = n / 2;
            boolean prime = true; // conditie ca numarul n sa fie prim este ca ea sa fie zero
               for (int i = 2; i <= half; i++)
                  if (n % i == 0) {
                     prime =false;
                     break;
                  }
            if (prime) {
               count++;
            }



         } while (count < m);
         System.out.println(n);
      }

}