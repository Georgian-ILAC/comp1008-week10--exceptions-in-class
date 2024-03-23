import java.util.Scanner;

// Derived Class Car
class Car extends Vehicle {

  // Private field
  private String bodyStyle;

  // Parameterized Constructor
  public Car(String make, String color, int year, String model, String bodyStyle) {
    super(make, color, year, model); // calling parent class constructor
    this.bodyStyle = bodyStyle;
  }

  public void carDetails() { // details of car
    printDetails(); // calling method from parent class
    System.out.println("Body Style: " + bodyStyle);
  }

  public void readMap1() {
    Scanner scanner = new Scanner(System.in);
    // FileReader reader = new FileReader("file.txt");

    // // passing FileReader to
    // // buffered reader
    // BufferedReader br = new BufferedReader(reader);

    // // declaring empty string
    // String data =null;

    // // while loop to read data
    // // and printing them
    // while ((data = br.readLine()) != null)
    // {
    // System.out.println(data);
    // }

    // // closing the object
    // br.close();
  }

  public void readMap2() {
    Scanner scanner = new Scanner(System.in);
    // FileReader reader = new FileReader("file.txt");

    // // passing FileReader to
    // // buffered reader
    // BufferedReader br = new BufferedReader(reader);

    // // declaring empty string
    // String data =null;

    // // while loop to read data
    // // and printing them
    // while ((data = br.readLine()) != null)
    // {
    // System.out.println(data);
    // }

    // // closing the object
    // br.close();
  }

  public void accelerate() {
    Scanner scanner = new Scanner(System.in);
    System.out.println("What speed do you like to drive at ?:");
    int speed = scanner.nextInt();

    // if(speed > 150){
    // throw new OverspeedingException();
    // }
  }

}