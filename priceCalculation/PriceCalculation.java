package priceCalculation;
import java.util.Scanner;

public class PriceCalculation {
    public static void main(String args[]) {
        
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter number of onion: ");
        int numberOfOnion = input.nextInt();
        System.out.print("Please enter cost per onion: ");
        int costPerOnion = input.nextInt();
        input.close();

        Onion newOnion = new Onion(numberOfOnion, costPerOnion);
        TotalPrice totalPrice = new TotalPrice(newOnion);
        totalPrice.finalCost();

    }
}
