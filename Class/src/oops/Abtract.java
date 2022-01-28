package oops;

	abstract class Parent {

		 

	
	    Parent()

	    {

	     
	        System.out.println("Parent Constructor Called");

	    }

	 

	    
	    abstract void fun();

	}

	 


	class Child extends Parent {

	 

	   
	    Child()

	    {

	        System.out.println("Child Constructor Called");

	    }

	 

	    void fun()

	    {

	        System.out.println("Child fun() called");

	    }

	}

	 

	
	public class Abtract {
	 

	

	    public static void main(String args[])

	    {

	       

	        Child d = new Child();

	    }

	}
	
	
	
	
	
	
	
	
	
	
	
	

