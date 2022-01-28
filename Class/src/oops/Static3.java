package oops;

public class Static3 {

	
	   
	    static int a = s1();
	      
	    
	    static {
	        System.out.println("Inside static block");
	    }
	      
	  
	    static int s1() {
	        System.out.println("from m1");
	        return 20;
	    }
	      
	    
	    public static void main(String[] args)
	    {
	       System.out.println("Value of a : "+a);
	       System.out.println("from main");
	    }
	}

