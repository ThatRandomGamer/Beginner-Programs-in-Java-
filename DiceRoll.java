// By the way, all of the projects in this workspace will have comments. This is the learning workspace after all! Remeber, always comment
// This is a console based dice roll-ing program. It uses the Random class. Good luck!



/* This is how to make a multi
line comment */
//Imports the random class
import java.util.Random;

//Sets up a class called DiceRoll
public class DiceRoll {

//Ah, the ever glorious main method
	public static void main(String[] args) {

// Sets up a random object called diceNum
		Random diceNum = new Random();
	
// Sets up an integer variable called dice and its value is the random number from diceNum		
		int dice = diceNum.nextInt((6) + 1); // Using 6 as the index would set the range as 0-5. (6) +1 sets it as 1-6. Weird Java quirck
		
//Prints or displays the random dice roll		
		System.out.println("The dice rolls. It reads: " + dice);
		
//P.S : It worked first try!		
	}

}
