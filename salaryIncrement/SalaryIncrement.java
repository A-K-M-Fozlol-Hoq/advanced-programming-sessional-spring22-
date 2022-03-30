package salaryIncrement;
import java.util.Scanner;
public class SalaryIncrement {
	public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the number of projects: ");
        int totalProjects = scan.nextInt();
        System.out.println("please enter the number of months: ");
        int totalMonths = scan.nextInt();
        scan.close();
        Employee empObj = new Employee(totalProjects, totalMonths);
        Increment incObj = new Increment(empObj);
        incObj.checkPerformance();
    }
}
