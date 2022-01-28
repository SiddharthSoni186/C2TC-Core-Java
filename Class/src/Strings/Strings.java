package Strings;

public class Strings {

	public static void main(String[] args) 
	
{
		// TODO Auto-generated method stub
		
		
     StringBuffer s= new StringBuffer("Siddharth");
     s.append(" Soni");
     System.out.println(s);
     
  
     String Name= new String("Siddharth Soni");
     System.out.println(Name);
     
 // Main   
     String fName= "Siddharth";
     String lName= "Soni";
     
    
    
  //1st Concatination
     System.out.println(fName+lName);
     
 // 2nd Concat
     System.out.println(fName.concat(lName));
     
 // 3rd indexof() method: for elemen
     System.out.println(fName.indexOf('S'));
     
 // 4th toUpperCase() To make capital 
     System.out.println(fName.toUpperCase());
     
 // 5th length() for size
     System.out.println(fName.length());
     
 // 6th endsWith() for ending letter
     System.out.println(fName.endsWith("h"));
     
//   7th startsWith() for first letter
     System.out.println(fName.startsWith("g"));
  
//   8th isEmpty() if empty
     System.out.println(fName.isEmpty());
	
//   9th \n for new line
     String Str = "Hello\nWorld!";
     System.out.println(Str);
     
     
//    10th trim() for trimming whitspace
     String str1 = "   Learn Java     ";
     System.out.println(str1.trim());
 
 //   11th toLowerCase() for small letters
     System.out.println(fName.toLowerCase()); 
 
 //   12th equals() case
     String str2 = " JAVA ";
     System.out.println(str2.equals("java")) ;
     
 //   13th Ignorecase()
     System.out.println(str2.equalsIgnoreCase("java")) ;
     
  // 14th formatin the strin
     String formatStr2 = String.format("Language: %s", str2);
     System.out.println(formatStr2);
     
  // 15th replace() for replace element
     System.out.println(str1.replace('e', 'c'));
     
 // 16 extract substring
     System.out.println(str1.substring(0, 2));
}

}
