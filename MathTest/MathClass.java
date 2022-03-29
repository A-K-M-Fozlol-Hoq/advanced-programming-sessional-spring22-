package MathTest;
import java.util.Scanner;

public class MathClass {
	public static void main (String args[])
	{
		 
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter two positive number: ");
		double num1 = scan.nextDouble(); 
	    double num2 = scan.nextDouble(); 
	    scan.close();
	    System.out.println("Power of x and y is: " + Math.pow(num1, num2));    
	}
	 
}
