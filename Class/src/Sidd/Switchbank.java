package Sidd;
import java.util.Scanner;
public class Switchbank {
	public static void main(String args[]){
         int num;
	    System.out.println("Welcome,your loan amount is INR:90000 rs");
	    
	    
	    System.out.println("Please select the number of installments you want to pay : ");
	    Scanner sc = new Scanner(System.in);
		   num = sc.nextInt();
	    
		   switch(num)
	    { 
	    case 0:
	  	  System.out.println("This is not valid installment");
	  	System.out.println("So you want to give full money right!");
	case 1:
	  System.out.println("You have to pay full amount 90000 rs in one installment");
	  break;
	case 2:
	  System.out.println("You have to pay half amount 45000 rs in two installments");
	  break;
	case 3:
	  System.out.println("You have to pay amount 30000 rs each in three installments");
	  break;
	case 4:
	   System.out.println("You have to pay amount 22500 rs each in four installments" );
	  break;
	default:
	  System.out.println("The number is out of range, please contact to authority");
		}
	 }
}
