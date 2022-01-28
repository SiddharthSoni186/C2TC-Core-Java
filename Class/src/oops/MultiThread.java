package oops;

	class CountThread extends Thread{

	CountThread(){

	super("Overrid Thread Class");

	System.out.println("New thread created" + this);

	start();

	}

	public void run(){ 

	    try{

	        for (int i=0 ;i<10;i++){

	System.out.println("New thread created" + this);

	Thread.sleep(1300);

	        }

	    }

	    catch(InterruptedException e){

	System.out.println("Currently executing thread is interrupted");

	}

	System.out.println("Currently executing thread run is terminated" );

	}

	}

	public class MultiThread{

	public static void main(String args[]){

		CountThread C = new CountThread();

	try{

	while(C.isAlive()){

	System.out.println("Main Thread live, until Child Thread will alive");

	Thread.sleep(2600); 

	}

	}

	catch(InterruptedException e){

	System.out.println(" Thread of Main Method is interrupted");

	}

	System.out.println("Thread of Main Method is terminated" );

	}

	}

