package Inherit;
// Multi level Inheritance
class Stepone {
    public void SSC()
    {
        System.out.println("SSC");
    }
}
 
class Steptwo extends Stepone {
    public void DipOrHsc() 
    {
    	
    	System.out.println("Diploma/HSC"); }
}
 
class Stepthree extends Steptwo {
    public void BE()
    {
        System.out.println("BE");
    }
}

public class Graduation{
	public static void main(String[] args)
    {
		System.out.println("Main Steps of Engineering Graduation ");
        Stepthree s = new Stepthree();
        s.SSC();
        s.DipOrHsc();
        s.BE();
    }
}

 
// Drived class
