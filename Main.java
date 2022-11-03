import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Test t = new Test("Awonke");
    System.out.println(t);

    Scanner input = new Scanner(System.in);
    input.useDelimiter("\\.");

    System.out.println("Enter your name");
    System.out.println("your name is " + input.next());

    input.close();
  }
}