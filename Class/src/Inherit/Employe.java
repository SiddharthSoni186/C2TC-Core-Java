package Inherit;

// Single level inheritance
	

class Employee{
		
			int salary(){
				int salary = 50000;
				System.out.println("Salary: "+salary);
				return salary;
			}  
			}  
			class Raj extends Employee{  
			int bonus(){
				int bonus = 20000;
				System.out.println("bonus: "+bonus);
				return bonus;
			}  
			}  
			public class Employe{  
			public static void main(String args[]){  
			Raj r=new Raj();  
			r.salary();  
			r.bonus();  
	}
	}


