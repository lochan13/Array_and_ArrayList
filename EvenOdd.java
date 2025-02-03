import java.util.ArrayList;
import java.util.Scanner;

public class EvenOdd {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    ArrayList<Integer> even = new ArrayList<>();
    ArrayList<Integer> odd = new ArrayList<>();

    System.out.println("Enter numbers (type 'exit' to stop):");

    while (true) {
      String input = scanner.nextLine();
      if (input.equalsIgnoreCase("exit")) {
        break;
      }
      try {
        int number = Integer.parseInt(input);
        if (number % 2 == 0) {
          even.add(number);
        } else {
          odd.add(number);
        }
      } catch (NumberFormatException e) {
        System.out.println("Please enter a valid number or type 'exit' to stop.");
      }
    }

    System.out.println("Even numbers: " + even);
    System.out.println("Odd numbers: " + odd);
  }
}