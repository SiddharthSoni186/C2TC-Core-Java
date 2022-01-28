package Arrays;

public class Average {
	
		public static void main(String[] args) {   
		 
		       int[] numbers = new int[]{10, 20, 35, 25, -10, 80, -30};
		      
		       int sum = 0;
		       for(int i=0; i < numbers.length ; i++)
		        sum = sum + numbers[i];
		    
		        double average = sum / numbers.length;
		        System.out.println("Average value of the array elements is : " + average); 
		   }
		}


