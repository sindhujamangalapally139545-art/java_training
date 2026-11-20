import java.util.Scanner;

public class arithmetic_operators {
   public arithmetic_operators() {
   }

   public static void main(String[] var0) {
      Scanner var1 = new Scanner(System.in);
      System.out.println("Enter a: ");
      int var2 = var1.nextInt();
      System.out.println("Enter b: ");
      int var3 = var1.nextInt();
      System.out.println("Addition: " + (var2 + var3));
      System.out.println("Substraction: " + (var2 - var3));
      System.out.println("Multplication: " + var2 * var3);
      System.out.println("Division: " + var2 / var3);
      var1.close();
   }
}
