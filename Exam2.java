

// Problem 2
// This code asks the user for Width, Height of Photo. If the Width is greater than Height the message displayed is “Landscape”. If the Width is Less than Height, the message displayed is “ Portrait ”. If the Width is equal to Height, the message displayed is “Square”

// Sample Output
// Enter Height of Photo
// 50
// Enter Width of Photo
// 20
// Portrait

// Modify the problem to ask the user to repeatedly for values of Height and Width till the user provides equal values of Height and Width  - that is the while loop has to repeatedly ask users for values of Height and Width till the user gives same values for both.
// Sample:
// Enter Height of Photo:
// 50
// Enter Width of Photo:
// 20
// Not a Square, Enter again
// Enter Height of Photo:
// 40
// Enter Width of Photo:
// 60
// Not a Square, Enter again
// Enter Height of Photo:
// 50
// Enter Width of Photo:
// 50
// Square,  Done



// The partial code is given below

// import // required class
// public class Exam2 {
// public static void main(String[] args) 
// {	
//   Scanner input = new Scanner(System.in);
//   // Ask user to enter values of width and height
  
//   // Write if elseif else to display Landscape Portrait Square
  

// //Modify code to use while loop till Width = Height		     
// while (// complete Boolean expression)
// { 
//      //ask user for width and height  
//  }// end of while

// 	}//end of main
// }//end of class



package problem1;

import java.util.Scanner;

public class Problem2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		boolean continueLoop = true;
		while (continueLoop) {
			System.out.println("Enter Height of Photo");
			int height = input.nextInt();
			System.out.println("Enter Width of Photo");
			int width = input.nextInt();

			if (width == height) {
				System.out.println("Sqaure Done");
				continueLoop = false;
			} else {
				System.out.println("Not a square. Enter Again");
			}

//			if (width > height) {
////				System.out.println("Landscape");
//				System.out.println("not a square. Enter Again");
//			} else if (width < height) {
//				System.out.println("not a square. Enter Again");
////				System.out.println("Portrait");
//			} else {
//				System.out.println("Sqaure");
//				continueLoop = false;
//			}
		}

		input.close();
	}
}