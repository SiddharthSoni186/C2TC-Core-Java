package Inherit;


	class AfterSSC{  
		public void science(){
			System.out.println("Take Science Stream");}  
		}  
		class AfterHSCTech extends AfterSSC{  
		void technical() {
			System.out.println("Take Technical line");
			System.out.println("Take Engineering");}  
		}  
		class AfterHSCMedi extends AfterSSC{
		void medical(){System.out.println("Take Medical line");
		System.out.println("Take MBBS or Pharma");}  
		}  
		public class Stream{  
		public static void main(String args[]){  
			AfterHSCTech t=new AfterHSCTech();
			t.science(); 
		t.technical();  
		 
		 
		}}  

