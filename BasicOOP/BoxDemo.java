package BasicOOP;
import java.util.Scanner;
public class BoxDemo {
	public static void main (String args[])
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter three positive number: ");
//	    double num1 = scan.nextFloat(); 
//	    double num2 = scan.nextFloat();  
//	    double num3 = scan.nextFloat();  
	    double num1 = scan.nextDouble(); 
	    double num2 = scan.nextDouble();  
	    double num3 = scan.nextDouble(); 
		Box box  = new Box(num1, num2, num3);
		double volume = box.getVolume();
		scan.close();
		box.printVolume(volume);
	}
}
