package english;

import java.util.Scanner;

public class Ejer3 {

    public static void main(String[] args) {

        double measure; // Variable to store the current measure input by the user

        double measureHight = 0;  // Variable to store the highest measure
        double measureLowest = 0; // Variable to store the lowest measure

        // Create a Scanner object to read input from the user
        Scanner sc = new Scanner(System.in);

        // Prompt the user to input the first measure
        System.out.println("Put the measure");
        System.out.print("Measure: ");
        
        // Read the first measure input
        measure = sc.nextDouble();
        
        // Initialize the lowest measure with the first input
        measureLowest = measure;

        // Continue the loop as long as the measure is greater than 0
        while (measure > 0) {

            // If the current measure is greater than the highest recorded measure, update it
            if (measure > measureHight) {
                measureHight = measure;
            }

            // If the current measure is smaller than the lowest recorded measure, update it
            if (measureLowest > measure) {
                measureLowest = measure;
            }

            // Ask the user for another measure
            System.out.print("Measure: ");
            measure = sc.nextDouble(); // Read the next measure

        }

        // After the loop, display the highest and lowest measures recorded
        System.out.println(
                "The highest measure is: " + measureHight + " cm.\nThe lowest measure is: " + measureLowest + " cm.");

        // Close the scanner to avoid resource leaks
        sc.close();
    }
}

