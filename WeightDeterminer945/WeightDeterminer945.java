package WeightDeterminer945;
import java.util.Scanner;


public class WeightDeterminer945 {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter item name: ");
		String itemName945 = input.nextLine();
		System.out.println("Please enter item height: ");
		double height945 = input.nextDouble();
		System.out.println("Please enter item weight: ");
		double weight945 = input.nextDouble();
		Weight945 itemOne745 = new Weight945(itemName945,height945, weight945);
		System.out.println(itemOne745.itemName945 );
		System.out.println(itemOne745.height945) ;
		System.out.println(itemOne745.weight945 );
		System.out.println(itemOne745.getWeight945() );
    }
}
