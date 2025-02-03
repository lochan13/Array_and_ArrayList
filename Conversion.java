import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Conversion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take array input from the user
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();

        int[] array = new int[n];
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        // Convert primitive int array to ArrayList<Integer>
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int num : array) {
            arrayList.add(num); // Manually add each element
        }
        System.out.println("Converted to ArrayList: " + arrayList);

        // Convert ArrayList<Integer> back to int array
        int[] newArray = new int[arrayList.size()];
        for (int i = 0; i < arrayList.size(); i++) {
            newArray[i] = arrayList.get(i);
        }
        System.out.println("Converted back to Array: " + Arrays.toString(newArray));

        scanner.close();
    }
}
