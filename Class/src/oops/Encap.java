package oops;
class Encapsulate {
	  
	    private String empName;
	    private int empId;
	    private int empAge;
	
	    public int getAge() 
	    { 
	    	return empAge;
	    	
	    }
	
	    public String getName()
	    { 
	    	return empName; 
	    }
	 
	  
	    public int getId()
	    { 
	    	return empId; 
	    }
	 
	   
	    public void setAge(int newAge) 
	    { 
	    	empAge = newAge;
	    }
	 
	
	    public void setName(String newName)
	    {
	        empName = newName;
	    }
	 
	  
	    public void setId(int newId) 
	    { 
	    	empId = newId; 
	    	
	    }
	}
	 
	public class Encap {
	    public static void main(String[] args)
	    {
	        Encapsulate en = new Encapsulate();
	 
	     
	        en.setName("Agastya");
	        en.setAge(25);
	        en.setId(1234);
	 
	        
	        System.out.println("emp's name: " + en.getName());
	        System.out.println("emp's age: " + en.getAge());
	        System.out.println("emp's Id: " + en.getId());
	 
	  
	    }
	}
	
