import java.io.*;

class Function {

  // metodo che esegue il getch() in java
  public static void pause() {
    try {
      System.out.println("\n\n\n\nPremere un tasto per continuare............\n\n\n");
      System.in.read();
    } catch (IOException e) {
      System.out.println("Error");
    }
  }

  // metodo che esegue il systemclear in java
  public static void clearConsole() {
    try {
      if (System.getProperty("os.name").contains("MacOS")) {
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
      } else {
        System.out.print("\033\143");
      }
    } catch (IOException | InterruptedException ex) {
    }
  }
}