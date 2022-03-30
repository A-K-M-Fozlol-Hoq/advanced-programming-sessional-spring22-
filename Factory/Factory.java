package Factory;
import java. util. Scanner;

public class Factory {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter product id (int format): ");
		int id = input. nextInt();
		System.out.println("Please enter product weight (double format): ");
		double weight = input. nextDouble();
		input.close();
		
		Product p0 = new Product(id, weight);
		System.out.println("Product id is: " + p0.getProductId());
		System.out.println("Product weight is: " + p0.getProductWeight());
		
		System.out.println("\nUpdating product using setter method: ");
		p0.setProductWeight(p0.getProductWeight()+1);
		p0.setProductWeight(p0.getProductWeight()+1);
		System.out.println("Udated product id is: " + p0.getProductId());
		System.out.println("Udated product weight is: " + p0.getProductWeight());
		
		Product p1 = p0.checkAndgenerat(p0.getProductId(), p0.getProductWeight());
		System.out.println("\nCreated product2's id is: " + p1.getProductId());
		System.out.println("Created product2's id is: " + p1.getProductWeight());
		
		Product p2 = p0.checkAndgenerat(p0.getProductId());
		System.out.println("\nCreated product2's id is: " + p2.getProductId());
		System.out.println("Created product2's id is: " + p2.getProductWeight());
		
		Product p3 = p0.checkAndgenerat(p0.getProductWeight());
		System.out.println("\nCreated product3's id is: " + p3.getProductId());
		System.out.println("Created product3's id is: " + p3.getProductWeight());
		
		Product p4 = p0.checkAndgenerat(p0);
		System.out.println("\nCreated product4's id is: " + p4.getProductId());
		System.out.println("Created product4's id is: " + p4.getProductWeight());
		
		Product p5 = p0.checkAndgenerat(p0.getProductId(),p0.getProductId());
		System.out.println("\nCreated product5's id is: " + p5.getProductId());
		System.out.println("Created product5's id is: " + p5.getProductWeight());
		
		Product p6 = p0.checkAndgenerat(p0.getProductWeight(),p0.getProductWeight());
		System.out.println("\nCreated product6's id is: " + p6.getProductId());
		System.out.println("Created product6's id is: " + p6.getProductWeight());
	}
}
