package abstraction;

import java.util.Scanner;

public class AbstractTest {
	
	public static void main(String[] args) {
		
		Scanner inp = new Scanner(System.in);
		Explainer ad1 = new Explainer();
		ad1.systemDetails();
		
		System.out.print("\nHow many tabs open in Chrome Browser: ");
		int inTab = inp.nextInt();
		
		ad1.testMethod(inTab);
		
		
	}
}
