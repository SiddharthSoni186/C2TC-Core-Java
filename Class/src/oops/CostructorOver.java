package oops;

public class CostructorOver {
	

	    double width, height, depth;

	    int boxNo;

	  

	  
	    CostructorOver(double w, double h, double d, int num)

	    {

	        width = w;

	        height = h;

	        depth = d;

	        boxNo = num;

	    }

	  

	    

	    CostructorOver()

	    {

	        // an empty box

	        width = height = depth = 0;

	    }

	  

	   
	    CostructorOver(int num)

	    {

	      
	        this();

	  

	        boxNo = num;

	    }

	  

	    public static void main(String[] args)

	    {
	    	CostructorOver box1 = new CostructorOver(1);

	  

	      

	        System.out.println(box1.width);

	    }
}
