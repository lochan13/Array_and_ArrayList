import java.util.Scanner;

public class NeighbourElement {
    
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take array input
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();

        if (n < 2) {
            System.out.println("Array must have at least two elements.");
            return;
        }

        int[] arr = new int[n];
        System.out.println("Enter " + n + " integers:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        // Find and print the result
        int index = findSmallestNeighborIndex(arr);
        System.out.println("Index of the first number: " + index);

        scanner.close();
    }
}
