// By the way, all of the projects in this workspace will have comments. This is the learning workspace after all! Remeber, always comment
// This is a console based dice roll-ing program. It uses the Random class. Good luck!



/* This is how to make a multi
line comment */
//Imports the scanner class
import java.util.Scanner;
public class AreaCalc {
	  
	//Ah yes, the main method. Never forget! 
	public static void main(String args[]) {
//Setting up scanner           	
		System.out.println("Enter shape. Choose from Square, Rectangle, Triangle(Only equilateral triangle are accepted), Circle and Parallelogram. \n Then enter lentgh and breadth. \n Breadth value will be used as base for triangle and parallelogram \n length value will be used as height for triangle and parallelogram and will be used as side length for Square and radius for circle");
            	  Scanner s = new Scanner(System.in);
            
        System.out.println("First enter the shape");
            	  String shape = s.next();
         
        System.out.println("Now enter the operation: Perimeter or Area");
            	  String op = s.next();
            	
        System.out.println("Enter the lentgh"); 
            	  int l = s.nextInt();
           
        System.out.println("Now enter the breadth, enter it as 1 if you chose circle or square. I dont know a workaround for it");
             	  int b =s.nextInt();
            	 
      //Now this is some wonky code. Tell me how to improve it
       
      //This is what I call nested switch case       	  
 
             	  //This is the main switch. It takes care of the shapes
            	 switch(shape) {
            	   case("Square"):
            		 //This is the nested switch which takes care of the operations. You could use if else statements here.   
            	     switch (op) {
            	  
            	      case("Perimeter"):
             		   System.out.println("The perimeter is:" + l * 4); 
            	      break;
            	      case("Area"):
              		   System.out.println("The area is:" + l * l);
            	      break;

            	   }
         	      break;

            	   case("Rectangle"):
              	     switch (op) {
              	  
              	      case("Perimeter"):
               		   System.out.println("The perimeter is:" + 2*(l+b));
            	      break;

              	      case("Area"):
                		   System.out.println("The area is:" + l*b);
            	      break;
              	   
              	   }
         	      break;
            	  
            	   case("Triangle"):
              	     switch (op) {
              	  
              	      case("Perimeter"):
               		   System.out.println("The perimeter is:" + 3 * l);
            	      break;

              	      case("Area"):
                		   System.out.println("The area is:" + 0.5 * l * b);
            	      break;
              	   
              	   }
         	      break;
            	   
            	   
            	   case("Parallelogram"):
              	     switch (op) {
              	  
              	      case("Perimeter"):

              	    	  System.out.println("The perimeter is:" + 2 * l + 2 *b);
            	      break;

              	      case("Area"):
                		   System.out.println("The area is:" + l * b);
            	      break;
              	   
              	   }
         	      break;

            	   case("Circle"):
              	     switch (op) {
              	  
              	      case("Perimeter"):
               		   System.out.println("The perimeter is:" + 2 * 3.14 * l);
            	      break;

              	      case("Area"):
                		   System.out.println("The area is:" + 3.14 * l * l);
            	      break;
              	   
              	   }
         	      break;
            	   
            	   
            	   
            	   
            	  }
            	  
              }
}
