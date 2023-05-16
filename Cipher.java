public class Cipher {
  // String for the alphabet, randomly generated number
  private String alpha = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
  private int howFar = (int)(Math.random()*26);
  // Empty constructor
  public Cipher() {

  }

  // Encoding method with original phrase as parameter
  public String encode(String original) {
    // Makes string capital
    original = original.toUpperCase();
    // Blank string to enter letters
    String encoded = "";
    // For loop going through original string length
    for (int i = 0; i < original.length(); i++) {
      // Finds letter from shift using modulus
      int p = alpha.indexOf(original.charAt(i));
      int k = (howFar + p) % 26;
      char r = alpha.charAt(k);
      // Adds letter to string
      encoded += r;
    }
    return encoded;
  }

  // Decoding method
  public String decode(String encoded) {
    encoded = encoded.toUpperCase();
    String original = "";
    for (int i = 0; i < encoded.length(); i++) {
      int p = alpha.indexOf(encoded.charAt(i));
      // Same process but subtraction is reversed here
      int k = (p - howFar) % 26;
      // If statement to account for index errors
      if (k < 0) {
        k = alpha.length() + k;
      }
      char r = alpha.charAt(k);
      original += r;
    }
    return original;
  }
}
