package oops;

class Emp {
	
	
	    int EmpId;
	    String Empname;
	 
	    
	    Emp()
	    {
	        System.out.println("Constructor called");
	    }
	}
	 
	class ConstEmp
	{
	    public static void main (String[] args)
	    {
	        
	        Emp emp1 = new Emp();
	 
	       
	        System.out.println(emp1.Empname);
	        System.out.println(emp1.EmpId);
	    }
	}
