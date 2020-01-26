// By the way, all of the projects in this workspace will have comments. This is the learning workspace after all! Remeber, always comment
//I added this comment later, This is a console based fortune cookie generator. You run the program and it prints a randomly selected fortune from an array. Good luck! Hint incoming, look away if you want to do it on your own SPACE SPACE SPACE    hint: Store your fortunes in a string array and use the array.lentgh to use as a range for the Random object. Use the random object to use as an index for the array




//Imports java Random
import java.util.Random;
//Creates a public class named FortuneCookie
public class FortuneCookie {
//Ah yes, the main method. Never forget!
	
      public static void main(String args []) {
    	  
//Now this is the juicy part! This creates a string array called fortunes and it is filled with, well, fortunes!
        
    	  String[] fortunes  = {"The fortune you seek is in another cookie." , "Test!","A conclusion is simply the place where you got tired of thinking" , "A closed mouth gathers no feet" ,"A cynic is only a frustrated optimistt" , "You will die alone and poorly dressed" , "If you look back, you'll soon be going that way" ,"You will live long enough to open many fortune cookies" , "You found an easter egg! IT is useless though, but there are a few more, keep looking!" , "Some fortune cookies contain no fortune.", "Don't let statistics do a number on you" ,"You will receive a fortune cookie." , "I am worth a fortune." , "You love Chinese food." ,"All fortunes are wrong except this one." , "It's about time I got out of that cookie" , "Minecraft is the best" ,"The road to riches is paved with homework." , "Actions speak louder than fortune cookies" , "Made by Rudra Singh!" ,"Flattery will go far tonight" , "Help! I am being held prisoner in a fortune cookie factory" , "I am, Iron Man!" ,"Fortune not found? Abort, Retry, Ignore." , "Don't forget you are always on our minds." , "You can always find happiness at work on Friday."};
//Creates a Random objects named fortunecookie aka fc
         
         Random fc = new Random();
//Creates an integer or int variable called fortunecookie key or fcKey.We tell it to create a random integer and fortunecookie.lenght is the range.
       
         int fcKey = fc.nextInt(fortunes.length); //The length is 26 currently. I could add more fortunes to it later but I think this is a pretty good number
//It prints or tells the screen to display the randomly genrated fortune
         
         System.out.println("You open your cookie. It reads: " +fortunes[fcKey]);
            	
            }
}
