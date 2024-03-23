import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String[] names = { "Elizaveta", "Harsh", "Deepanshu", "Jane", "Man" };
    // try-catch for Exception Handling
    // wherever we expect error, wrap it around a try block

    // Array Index

    for (int i = 0; i <= 4; i++) {
      System.out.println(names[i]);
    }

    double a, b;
    System.out.println("Enter value for a:");
    a = scanner.nextDouble();

    System.out.println("Enter value for b:");
    b = scanner.nextDouble();
    double c = a / b;

    Car x;

    System.out.println("Reminder of division" + a / b);

  }
}