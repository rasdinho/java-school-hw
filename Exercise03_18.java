// (Cost of shipping) A shipping company uses the following function to calculate the cost (in dollars) of shipping based on the weight of the package (in pounds).

// c(w)=⎧⎩⎨⎪⎪⎪⎪3.5,if0<w<=15.5,if 1<w<=38.5,if 3<w<=1010.5,if 10<w<=20
// Write a program that prompts the user to enter the weight of the package and displays the shipping cost. If the weight is negative or zero, display a message “Invalid input.” If the weight is greater than 20, display a message “The package cannot be shipped.”

import java.util.Scanner;

public class Exercise03_18 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter the weight of the package: ");
		double weight = input.nextDouble();

		if (weight > 50)
			System.out.println("The package cannot be shipped.");
		else
		{
			double costPerPound; 
			if (weight > 0 && weight <= 1)
				costPerPound = 3.5;
			else if (weight <= 3)
				costPerPound = 5.5;
			else if (weight <= 10)
				costPerPound = 8.5;
			else //if (weight <= 20)
				costPerPound = 10.5;
			System.out.println("Shipping cost of package is $" +
				costPerPound * weight);
		}
	}
}