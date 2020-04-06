public class ThrowsExample {

  public static void main(String[ ] args) throws RuntimeException  {
      int x = 10;
      int y = 2;

      System.out.println(x/y);

      y = 0;

      System.out.println(x/y);  // Ao tentar dividir por 0 caira no catch

  }

}
