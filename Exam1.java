// Problem 1
// The code calculates the tip to be paid at restaurant. The code asks the user to rate their service. The tip to be given is computed using the cost of meal and rating level.
// Ask for rating level: (Excellent, Good, Dissatisfied is given for your understanding.
// The code only uses numbers 4,3,2) 4 = Excellent, 3 = Good,  2 = Dissatisfied
// If the rating is Excellent, calculate a 25 percent tip. If the rating is good, calculate a 15 percent tip and If the rating is Dissatisfied, calculate a 10 percent tip. The user also provides the cost of meal.
// First do the problem with if statement.
// Modify the same problem to use a switch statement to replace the if statement.
// Sample:
// Enter the cost of your meal: 50
// Enter the rating level: 4
// Your tip today: 50 * 0.25 = 12.50

// The partial code is given. Comments are given to help you. Complete the code. 
// //import all needed class
// public class Exam1{
// public static void main(String []args){		         
// double tip;
// double costMeal;
// int rating;
// Scanner input = new Scanner(System.in);
// //ask user for cost of meal and store result in costMeal
// //ask user for rating Level and store result in rating
// // Use if else elseif to calculate tip

// System.out.println("The Tip is " + tip);// Display the tip
		    
// //Do the same as above but with switch 
// switch (rating)
// //Write the 2 different cases default is done for you		        
// { //write for rating 4 
//   //write for rating 3
//  default: tip = 0.1 * costMeal;
// }
		        
// System.out.println("The Tip is " + tip);// Display tip
// }// end of Main
// }//end of Class
		        

package problem1;

import java.util.Scanner;

public class Exam1{
public static void main(String[] args){
    Scanner scn = new Scanner(System.in);
    System.out.print("Enter price of meal: ");
 
  Double price = scn.nextDouble();
    System.out.print("How satisfied were you with your experience?: ");
    int rating = scn.nextInt();
   
    if (rating == 4){
       double tipPercent = 0.2;
       double tip = price * tipPercent;
       System.out.println(rating + ", " + "$" + tip);
    }
    else if (rating == 3){
       double tipPercent = 0.15;
       double tip = price * tipPercent;
       System.out.println(rating + ", " + "$" + tip);
    }
    else {
       double tipPercent = 0.1;
       double tip = price * tipPercent;
       System.out.println(rating + ", " + "$" + tip);
    }
    
	scn.close();

	}
}

// =========================================== Using Switch ===============================


package problem1;

import java.util.Scanner;
import java.math.BigDecimal;
import java.math.RoundingMode;
public class Exam1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the cost of your meal");
		BigDecimal mealCost = input.nextBigDecimal();
		System.out.println("Enter your rating (4, 3, or 2)");
		int rating = input.nextInt();

		BigDecimal tipRate = new BigDecimal(0); // the tip is going to be 0

		switch(rating) {
		case 4:
			tipRate = new BigDecimal(0.20);
			break;
		case 3:
			tipRate = new BigDecimal(0.15);
			break;
		case 2:
			tipRate = new BigDecimal(0.1);
			break;
		default:
			break;
		}

		BigDecimal totalTip = tipRate.multiply(mealCost); // multipy is built in to the BigDecimal
		System.out.println("Your tip is: " + totalTip.setScale(2, RoundingMode.DOWN)); // setScale in also built in.

		input.close();
	}
}