package english;

import java.util.Scanner;

public class Ejer3 {

	public static void main(String[] args) {

		double measure;

		double measureHight = 0;
		double measureLowest = 0;

		Scanner sc = new Scanner(System.in);

		System.out.println("Put the measure");
		System.out.print("Measure: ");

		measure = sc.nextDouble();
		
		measureLowest = measure;

		while (measure > 0) {

			if (measure > measureHight) {

				measureHight = measure;

			}
			
			if (measureLowest > measure) {
				measureLowest = measure;
			}

			System.out.print("Measure: ");
			measure = sc.nextDouble();

		}

		System.out.println(
				"The hight measure is: " + measureHight + " cm.\nThe lowest measure is: " + measureLowest + " cm.");

		sc.close();

	}

}
