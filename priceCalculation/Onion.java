package priceCalculation;

public class Onion {
    private int numberOfOnion;
    private int costPerOnion;

    public Onion(int numberOfOnion, int costPerOnion) {
        this.numberOfOnion = numberOfOnion;
        this.costPerOnion = costPerOnion;
    }
    
    public void setNumberOfOnion(int numberOfOnion) {
        this.numberOfOnion = numberOfOnion;
    }
    
    
    public int getNumberOfOnion() {
        return this.numberOfOnion;
    }

    public void setCostPerOnion(int costPerOnion) {
        this.costPerOnion = costPerOnion;
    }
    
    public int getCostPerOnion() {
        return this.costPerOnion;
    }

}
