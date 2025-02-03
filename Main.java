/*
 * NAME: LOCHAN PAUDEL
 * PRN: 23070126170
 * BATCH: 2023-27
 */

import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayInput Ai = new ArrayInput(scan); // Create ArrayInput object
        ArrayFunctions Af = new ArrayFunctions(); // Create ArrayFunctions object

        int[] userArray = Ai.userInput(); // Get array input from user

        Af.oddEven(userArray); // Perform odd/even separation
        Af.minDif(userArray); // Find minimum consecutive difference
        Af.displayConversions(userArray); // Demonstrate array conversions
    }
}
