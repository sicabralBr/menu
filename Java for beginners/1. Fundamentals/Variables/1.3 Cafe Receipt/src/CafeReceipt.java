public class CafeReceipt
{
   public static void main(String[] args)
   {
      //Information to be printed.
      String customerName = "Hisao";
      String cupsOfCoffee = "1";
      String costOfCoffee = "99.9";
      Boolean tip = true;

      //Print that information in the console.

      System.out.println("Dear " + customerName + ", thank you for supporting our business!");
      System.out.println("Cups of coffee bought: " + cupsOfCoffee + ".");
      System.out.println("Cost of 1 cup of coffee: $" + costOfCoffee + ".");
      System.out.println("Your total is: $99.9.");
      System.out.print("Tip is included? " + tip + ".");
   }
}