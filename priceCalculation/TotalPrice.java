package priceCalculation;

public class TotalPrice {
    public Onion onionObj;
    
    public TotalPrice() {
    }
    
    public TotalPrice(Onion newOnion) {
        this.onionObj = newOnion;
    }
    
    public void finalCost() {
        int finalCost = onionObj.getNumberOfOnion() * onionObj.getCostPerOnion();
        System.out.println("\nTotal Price: " + finalCost);
        int sqaureValue = finalCost * finalCost;
        String finalCostStr=String.valueOf(finalCost);
        String sqaureValueStr=String.valueOf(sqaureValue);
        System.out.println(finalCostStr+ sqaureValueStr);
        if(sqaureValueStr.endsWith(finalCostStr)) {
            System.out.println("Pricing is too high! Can't afford!");
        } else {
            System.out.println("Pricing is okay");
        }
    }
}
