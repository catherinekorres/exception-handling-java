public class TryCatchExample {

  public static void main(String[ ] args) {
    try {
      int x = 10;
      int y = 2;

      System.out.println(x/y);

      y = 0;

      System.out.println(x/y);  // Ao tentar dividir por 0 caira no catch

    } catch (Exception e) {
      System.out.println("Algo deu errado. Nao foi possivel executar o codigo.");
    }
  }

}
