import java.util.Scanner;
public class Calcu {

//Ran well on first try, had to search up how to use scanner tho
	
//First we declare the variables
	
	public static int firstNum;
	public static int secondNum;
	public static String operand;
	static int result = 0;
	
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
		operand = sc.next();
		
//Setup switch cases
	switch(operand) {
		case "+":
			sum = firstNum + secondNum;
			System.out.println( "Sum is" + " " + result); //I kind of forgot how to print a variable with a "" but later on i remembered, lol
			break;
		case "-":	
			sum = firstNum - secondNum;
			System.out.println( "Difference is" + " " + result);
			break;
		case "*":	
			sum = firstNum * secondNum;
			System.out.println( "Product is" + " " + result);
			break;
		case "/":	
			sum = firstNum / secondNum;
			System.out.println( "Quotient is" + " " + result);
			break;
		
		
		}
		
	}

}
