import java.util.*;

class ArrayInput {
    private Scanner scan;

    // Constructor accepts an already created Scanner object
    public ArrayInput(Scanner scan) {
        this.scan = scan;
    }

    // Get integer array input from user
    public int[] userInput() {
        System.out.println("Enter the size of the array:");
        int size = scan.nextInt(); // Read array size

        int[] array = new int[size]; // Create array based on size

        System.out.println("Enter " + size + " integers:");
        for (int i = 0; i < size; i++) {
            array[i] = scan.nextInt(); // Read each array element
        }

        return array;
    }
}
