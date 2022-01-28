package Sidd;

import java.util.Scanner;
public class SwitchInput {
	public static void main(String args[]){
         int x;
	    System.out.println("Enter the input");
	    
	    Scanner sc = new Scanner(System.in);
		   x = sc.nextInt();
	    
		   switch(x)
	    {   
	case 1:
	  System.out.println("Hello Guys");
	  break;
	case 2:
	  System.out.println("Hello Mumbai");
	case 3:
	  System.out.println("Hello Mandvi");
	  break;
	case 4:
	         System.out.println(19.8);
	         break;
	default:
	  System.out.println("Jai Shree Krishn");
		}
	 }
}
