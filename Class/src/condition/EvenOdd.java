package condition;
import java.util.Scanner;
public class EvenOdd {
	
	  public static void main(String args[])
	  {
	    int num;
	    System.out.println("Enter a number:");

	   
	    Scanner input = new Scanner(System.in);
	   
	    num = input.nextInt();
	    
	    if ( num % 2 == 0 )
	        System.out.println("The  number is even");
	     else
	        System.out.println("The number is odd");
	  }

}
