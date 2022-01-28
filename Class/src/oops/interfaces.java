package oops;

	  

	interface Vehicle {


	    void Gearchange(int a);

	    void Upspeed(int a);

	    void Brakesapply(int a);

	}

	  

	class Cycle implements Vehicle{

	      

	    int speed;

	    int gear;

	      

	   
	   

	    public void Gearchange(int newGear){

	          

	        gear = newGear;

	    }

	      


	    public void Upspeed(int increment){

	          

	        speed = speed + increment;

	    }

	      

	   

	    public void Brakesapply(int decrement){

	          

	        speed = speed - decrement;

	    }

	      

	    public void printStates() {

	         System.out.println("speed: " + speed

	              + " gear: " + gear);

	    }

	}

	  

	class Bike implements Vehicle {

	      

	    int speed;

	    int gear;

	      

	  

	    public void Gearchange(int newGear){

	          

	        gear = newGear;

	    }

	      

	    

	    public void Upspeed(int increment){

	          

	        speed = speed + increment;

	    }

	      

	

	    public void Brakesapply(int decrement){

	          

	        speed = speed - decrement;

	    }

	      

	    public void printStates() {

	         System.out.println("speed: " + speed

	             + " gear: " + gear);

	    }

	      

	}

	public class interfaces {

	      

	    public static void main (String[] args) {

	      


	        Cycle bicycle = new Cycle();

	        bicycle.Gearchange(2);

	        bicycle.Upspeed(3);

	        bicycle.Brakesapply(1);

	          

	        System.out.println("Bicycle present state of Cycle:");

	        bicycle.printStates();

	          

	     

	        Bike bike = new Bike();

	        bike.Gearchange(1);

	        bike.Upspeed(4);

	        bike.Brakesapply(3);

	          

	        System.out.println(" present state oF Bike:");

	        bike.printStates();

	    }

	}
