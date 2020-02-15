// By the way, all of the projects in this workspace will have comments. This is the learning workspace after all! Remeber, always comment
// This is a console based dice roll-ing program. It uses the Random class. Good luck!



/* This is how to make a multi
line comment */
//Imports the scanner class
import java.util.Scanner;
public class TempCon {
	  
	//Ah yes, the main method. Never forget! 
	public static void main(String args[]) {
//Setting up scanner           	
           System.out.println("This is a temperature convertor. It supports Celsius, Kelvin and Farenheit.");
		Scanner s = new Scanner(System.in);
            
        System.out.println("Enter which temperature you are going to convert from");
            	  String temp1 = s.next();
         
        System.out.println("Enter which temperature you are going to convert to");
            	  String temp2 = s.next();
            	
        System.out.println("Enter the temperature"); 
            	  int t = s.nextInt();
           
        
            	 
      //Now this is some wonky code. Tell me how to improve it
       
      //This is what I call nested switch case       	  
 
             	  //This is the main switch. It takes care of the temps
            	 switch(temp1) {
            	   case("Celsius"):
            		 //This is the nested switch which takes care of the operations. You could use if else statements here.   
            	     switch (temp2) {
            	  
            	      case("Kelvin"):
             		   System.out.println("The temperature in Kelvin is is:" + (t+ 273) ); 
            	      break;
            	      case("Farenheit"):
              		   System.out.println("The temperature in Farenheit is is:" + ((t * 9/5) + 32 ));

            	      break;

            	   }
         	      break;

            	   case("Kelvin"):
              	     switch (temp2) {
              	  
              	      case("Celsius"):
               		   System.out.println("The temperature in Celsius is is:" + (t-273));
            	      break;

              	      case("Farenheit"):
                		   System.out.println("The temperature in Farenheit is:" +(t - 273) * 9/5 + 32);
            	      break;
              	   
              	   }
         	      break;
            	  
            	   case("Farenheit"):
              	     switch (temp2) {
              	  
              	      case("Celsius"):
               		   System.out.println("The temperature in Celsius is is:" + (t - 32) * 5/9 );
            	      break;

              	      case("Kelvin"):
                		   System.out.println("The temperature in Kelvin  is:" + (t - 32) * 5/9 + 273);
            	      break;
              	   
              	   }
         	      break;
            	   
            	 }
            	 {
              	  
            	   
            	   
            	   
            	   
            	  }
            	  
              }
}
