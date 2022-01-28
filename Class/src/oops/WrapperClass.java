package oops;

public class WrapperClass {
	
		public static void main(String args[]){  
		byte b=15;  
		short s=10;  
		int i=20;  
		long l=50;  
		float f=30.0F;  
		double d=80.0D;  
		char c='s';  
		boolean b2=true;  
		  
		
		Byte byteob=b;  
		Short shortob=s;  
		Integer intob=i;  
		Long longob=l;  
		Float floatob=f;  
		Double doubleob=d;  
		Character charob=c;  
		Boolean boolob=b2;  
		
		System.out.println("Printing object values");  
		System.out.println("Byte object: "+byteob);  
		System.out.println("Short object: "+shortob);  
		System.out.println("Integer object: "+intob);  
		System.out.println("Long object: "+longob);  
		System.out.println("Float object: "+floatob);  
		System.out.println("Double object: "+doubleob);  
		System.out.println("Character object: "+charob);  
		System.out.println("Boolean object: "+boolob);  
		  
		 
		byte bytevalue=byteob;  
		short shortvalue=shortob;  
		int intvalue=intob;  
		long longvalue=longob;  
		float floatvalue=floatob;  
		double doublevalue=doubleob;  
		char charvalue=charob;  
		boolean boolvalue=boolob;  
		  
		
		System.out.println("Printing primitive values");  
		System.out.println("byte value: "+bytevalue);  
		System.out.println("short value: "+shortvalue);  
		System.out.println("int value: "+intvalue);  
		System.out.println("long value: "+longvalue);  
		System.out.println("float value: "+floatvalue);  
		System.out.println("double value: "+doublevalue);  
		System.out.println("char value: "+charvalue);  
		System.out.println("boolean value: "+boolvalue);  
		}
		} 
