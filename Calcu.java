import java.util.Scanner;
public class Calcu {
/* This is how to make a multi
line comment */

//I added this comment later, This is a console based calulator. You get user input for the first number, second number and the opperation (+ - * /) and then you calculate the result and print it to the screen. Good luck!
	
	

	
//Ran well on first try, had to search up how to use scanner tho
	
//First we declare the variables
	
	public static int firstNum;
	public static int secondNum;
	public static String opperand;
	static int sum = 0;
	
//Main method, classic	
	
	public static void main(String[] args) {
		
//Setup scanner object
		
		Scanner sc = new Scanner(System.in);
		//Instructions for the user, could have been better, I am just lazy
		
		System.out.println("Enter First Num, Second Num and + - * /");
		//Now we get values for the variables from the user
		
		firstNum = sc.nextInt();
		secondNum = sc.nextInt();
		
		//Next() method defaults a string, have to specify other data types for other data types i.e int
		opperand = sc.next();
//Setup switch cases
	switch(opperand) {
		case "+":
			sum = firstNum + secondNum;
			System.out.println( "Sum is" + " " + sum); //I kind of forgot how to print a variable with a "" but later on i remembered, lol
			break;
		case "-":	
			sum = firstNum - secondNum;
			System.out.println( "Sum is" + " " + sum);
			break;
		case "*":	
			sum = firstNum * secondNum;
			System.out.println( "Sum is" + " " + sum);
			break;
		case "/":	
			sum = firstNum / secondNum;
			System.out.println( "Sum is" + " " + sum);
			break;
		
		
		}
		
	}

}
