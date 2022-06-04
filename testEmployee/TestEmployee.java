package testEmployee;
import java.util.Scanner;
public class TestEmployee {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		Employee employeeArray[] = new Employee[5] ;

		Employee e1= new Employee("Org1",945, "fozlol1", "programmer1",21 );
		employeeArray[0] = e1;
		Employee e2= new Employee("Org2",945, "fozlol2", "programmer1",21 );
		employeeArray[1] = e2;
		Employee e3= new Employee("Org3",945, "fozlol3", "programmer1",21 );
		employeeArray[2] = e3;
		Employee e4= new Employee("Org3",945, "fozlol3", "programmer1",21 );
		employeeArray[3] = e4;
		Employee e5= new Employee("Org3",945, "fozlol3", "programmer1",21 );
		employeeArray[4] = e5;

		
		
		
		System.out.println("Please enter eid to search: ");
		int searchEid = input.nextInt();
		System.out.println("Please enter name to search: ");
		// Skip the newline
		input.nextLine();
		String searchName= input.nextLine(); 
		System.out.println("Please enter designation and age to search: ");
		String searchDesigantion = input.nextLine();
		int searchAge = input.nextInt();
		input.close();

		Employee matchByEId[] = new Employee[5] ;
		int matchedByEId = 0;
		for(int i = 0; i<5; i++) {
			Employee currentEmployee = employeeArray[i];
			if(currentEmployee.findEmployee(employeeArray, searchEid)) {
				matchByEId[matchedByEId] = currentEmployee;
				matchedByEId ++;
			}
		}
		if(matchedByEId == 0) {
			System.out.println("No Result found with this EId!");
		}else {
			System.out.println(matchedByEId+" result(s) is/are found with this EId!");
		}
		

		
		Employee matchByEName[] = new Employee[5] ;
		int matchedByEName = 0;
		for(int i = 0; i<5; i++) {
			Employee currentEmployee = employeeArray[i];
			if(currentEmployee.findEmployee(employeeArray, searchName))  {
				matchByEName[matchedByEName] = currentEmployee;
				matchedByEName ++;
			}
		}
		if(matchedByEName == 0) {
			System.out.println("No Result found with this EName!");
		}else {
			System.out.println(matchedByEName+" result(s) is/are found with this EName!");
		}
		
		Employee matchByEDesignAndEAge[] = new Employee[5] ;
		int matchedByEDesignAndEAge = 0;
		for(int i = 0; i<5; i++) {
			Employee currentEmployee = employeeArray[i];
			if(currentEmployee.findEmployee(employeeArray, searchDesigantion,searchAge )) {
				matchByEDesignAndEAge[matchedByEDesignAndEAge] = currentEmployee;
				matchedByEDesignAndEAge ++;
			}
		}
		if(matchedByEDesignAndEAge == 0) {
			System.out.println("No Result found with this employee designation and age!");
		}else {
			System.out.println(matchedByEDesignAndEAge+" result(s) is/are found with this employee designation and age!");
		}
		
	}
}