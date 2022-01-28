package condition;

import java.util.Scanner;

public class Area {
	   public static void main (String[] args)
	   {
		   Scanner sc = new Scanner(System.in);
		   
		   System.out.println("Enter length of Rectangle:");
		   double length = sc.nextDouble();
		   
		   System.out.println("Enter width of Rectangle:");
		   double width = sc.nextDouble();
		   
		   double area = length*width;
		   System.out.println("Area of Rectangle is:"+area);
	   }
	}
