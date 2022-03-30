package salaryIncrement;

public class Increment {
    public Employee empObj;
    
    public Increment() {
    	this.empObj =null;
    }
    public Increment(Employee empObj) {
        this.empObj = empObj;
    }

    void checkPerformance(){
        int performance = empObj.getTotalProjects() * empObj.getTotalMonths() + 100;
        System.out.println("\nPerformance Result is: " + performance);
        int sumOfPerformance = 0;
        while (performance > 0) {
        	sumOfPerformance += Math.pow((performance % 10), 3);
        	performance = performance / 10;
        }
        if(sumOfPerformance%2 == 0){
            System.out.println("Employee's performance is bad, Increment not granted");
        }
        else{
            System.out.println("Employee's performance is good, Increment granted");
        }

    }
}
