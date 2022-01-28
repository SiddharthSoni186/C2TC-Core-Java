package Basics;


public class Comments {

	public static void main(String[] args) {
		
		
		System.out.println("COMMENTS");
		// used for single line comment
		System.out.println("This is Single-line comments single line start with // will not be executed");
				
		
	/*	

"This line =
System.out.println("Hello "); 
will not print because it is between multi line comments"
*/
		System.out.println("Multi-line comments start with /* and ends with */. The lines between /* */ will not executed");
		
	//	The documentation comments are placed between /** and */.
		/**  
		* 
		*it can use various tags to depict the parameter 
		* use  heading or author name 
		*it  can also use HTML tags   
		* 
		*/ 
		
		//eg
		/** 
		  * <b>Note:</b> Comments make the code readable and  
		 * easy to understand. 
		 * <h1> Calculation of numbers </h1>   
		 * <p>  
		 * @version 18.0 
		 * @since 2021-07-06 
		 * @author Siddharth
		 */  
		System.out.println("documentation comments are placed between /** and */ and used tags various tags for author name,html tags etc");
	}

}
