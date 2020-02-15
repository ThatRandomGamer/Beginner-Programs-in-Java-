// By the way, all of the projects in this workspace will have comments. This is the learning workspace after all! Remeber, always comment
// This is a programming exercise where we calculate costs based on number of cans. It uses the Scanner class. Good luck!

/* This is how to make a multi
line comment */
//Imports the scanner class
import java.util.Scanner;

public class PaintCost {
//We declare variables
	static int canvasCost = 40; //You can just use 40 or whatever amount you want in the calculation if you need. Same for paint cost
	static int paintCost = 5;
	static int paintCans;
	static int total;
	static float cost;
	//Ah yes, the main method. Never forget! 
		public static void main(String args[]) {
			Scanner s = new Scanner(System.in); //Here we set up scanner object
		System.out.println("Enter the number of paint cans you want.");
			paintCans = s.nextInt(); //We get the number of cans 
			total = (paintCost * paintCans) + canvasCost; // We multiply the number of cans by the cost of 1 can then add the cost of canvas. 
			cost = (total * (10/100.0f)) + total; // We calculate 10% tax then add it to the total to get the cost.
			System.out.println("The total cost + 10% tax is:"+ cost);
		}
}
