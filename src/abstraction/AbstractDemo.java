package abstraction;

public abstract class AbstractDemo {
	
	abstract void systemDetails();
	
	public void testMethod(int a)
	{
		int oneTabRam = 127;
		float ramUses = a * oneTabRam;
		System.out.println("Ram Uses By Chrome Browser : "+ramUses+" MB");
	}

}

class Explainer extends AbstractDemo
{
	void systemDetails()
	{
		String devName = "HP";
		String sysOS = "Window 10";
		
		System.out.println("Specification: ");
		System.out.println("Device Name: "+devName
				+"\nOpertaing System: "+sysOS);
	}


}
