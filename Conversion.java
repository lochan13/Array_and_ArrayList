import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Conversion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take array input from the user
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        String[] array = new String[n];
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextLine();
        }

        // Convert array to ArrayList
        ArrayList<String> arrayList = new ArrayList<>(Arrays.asList(array));
        System.out.println("Converted to ArrayList: " + arrayList);

        // Convert ArrayList back to array
        String[] newArray = new String[arrayList.size()];
        arrayList.toArray(newArray);
        System.out.println("Converted back to Array: " + Arrays.toString(newArray));

        scanner.close();
    }
}
