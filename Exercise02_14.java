/* Paste your Exercise02_14 here and click Automatic Check.
For all programming projects, the numbers should be double 
unless it is explicitly stated as integer.
If you get a java.util.InputMismatchException error, check if 
your code used input.nextInt(), but it should be input.nextDouble().
For integers, use int unless it is explicitly stated as long. */

import java.util.Scanner;

public class Exercise02_14 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		final double KILOGRAMS_PER_POUND = 0.45359237;
		final double METERS_PER_INCH = 0.0254;

		System.out.print("Enter weight in pounds: ");
		double weight = input.nextDouble();

		System.out.print("Enter height in inches: ");
		double height = input.nextDouble();

		weight = weight * KILOGRAMS_PER_POUND;

		height = height * METERS_PER_INCH;

		double bodyMassIndex = weight / Math.pow(height, 2);

		System.out.println("BMI is " + bodyMassIndex);
	}
}