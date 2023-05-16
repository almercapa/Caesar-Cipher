// Importing scanner
import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    // Declaring scanner
    Scanner input = new Scanner(System.in);
    String original = "", encoded = "";
    // Declaring object
    Cipher c = new Cipher();
    // Extra: User input
    System.out.println("How many phrases would you like to enter?");
    int n = input.nextInt();
    for (int i = 0; i < n; i++) {
      System.out.println("Enter your phrase: ");
      original = input.next();
      // Cipher methods + printing results
      encoded = c.encode(original);
      System.out.println(encoded);
      original = c.decode(encoded);
      System.out.println(original);
    }
  }
}
