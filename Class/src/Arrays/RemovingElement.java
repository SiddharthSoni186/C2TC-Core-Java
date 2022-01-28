package Arrays;
import java.util.Arrays; 
public class RemovingElement {

	public static void main(String[] args) {
	   int[] my_array = {15, 34, 54, 25, 46, 66, 76, 28, 19, 29};
	   
	   System.out.println("Original Array : "+Arrays.toString(my_array));     
	   
	 
	   int removeIndex = 1;

	   for(int i = removeIndex; i < my_array.length -1; i++){
	        my_array[i] = my_array[i + 1];
	      }
	
	    System.out.println("After removing the second element: "+Arrays.toString(my_array));
	 }
	 }

