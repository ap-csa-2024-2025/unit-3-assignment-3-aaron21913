import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    // TODO: Problem 1
    Scanner numInput = new Scanner (System.in);
    System.out.println("Enter first number: ");
    int first = numInput.nextInt();
    System.out.println("type second number: ");
    int second = numInput.nextInt();
    if(second == 0) {
      System.out.println("Cannot divide by 0");
      return;
    }

    int ratio = first / second;
    if (ratio > 1 && ratio <= 8) {
      System.out.println("Ratio OK");
    }


    // TODO: Problem 2
    System.out.println("Enter one int: ");
    int a = numInput.nextInt();
    System.out.println("Enter second int: ");
    int b = numInput.nextInt();
    if(second == 0) {
      System.out.println("ERROR LOL");
    }
    else 
    {
      if (a % b = 0) {
        System.out.println("Is a factor") 
      }
      else {
        System.out.println("Is not a factor");
      }
    }

    


    // TODO: Problem 3
    System.out.println("Enter an int in the fifties: ");
    int dab = numInput.nextInt();
    if(dab >= 50 && dab <=59) {
      System.out.println("Your number is " + dab);
    }
    else{
      System.out.println("That number is not in the fifties");
    }


  // TODO: In-class assignment
  // Create a method that takes in two Rectangles and returns
  // true if they are equal, and false otherwise.  Two
  // Rectangles are considered equal if their widths are equal,
  // and if their lengths are equal.
  public static boolean rectEqual(Rectangle r1, Rectangle r2)
  {
    // implement solution here
    return false;
  }
}
