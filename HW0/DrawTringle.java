public class PrintAbsoluteValue {
   public static void drawTriangle(int N){
   int i = 0;
   while (i < N){
      int x = 1;
      i += 1;
      while (x < i){
         x += 1;
         System.out.print("*");
      }
      System.out.println("*");
   }
}
   public static void main(String[] args) {
      int N = 10;
      drawTriangle(N);
   }
}