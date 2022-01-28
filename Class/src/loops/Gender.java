package loops;
import java.util.*; 
public class Gender {
	

	
		public static void main(String[] args) { 
			Scanner sc=new Scanner(System.in); 
			System.out.println("Enter M or F"); 
			char g=sc.next().charAt(0); 
		 
			 
			switch(g){ 
			case 'M': 
				System.out.println("Gender is Male"); 
				break; 
			case 'F': 
				System.out.println("Gender is Female"); 
				break; 
			} 
			sc.close(); 
	 
		} 
	 } 

